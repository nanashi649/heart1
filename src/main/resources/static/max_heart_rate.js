function calculateAll() {
	maxHeartCalculate();
	heartCalculate();
	updateHeartRates();
	updateChart();
}

// 最大心拍数から53%の値を計算
function maxHeartCalculate() {
	const maxHeart = parseFloat(document.getElementById("maxHeart").value) || 0;
	const halfRate = Math.floor(maxHeart * 0.53);
	document.getElementById("halfRate").value = halfRate;
}

// 最大心拍数 -10 の計算
function heartCalculate() {
	const maxHeart = parseFloat(document.getElementById("maxHeart").value);
	const HeartRateI = maxHeart - 10;
	document.getElementById("HeartRateI").value = HeartRateI;
}

// HeartRateH～HeartRateAの計算
function updateHeartRates() {
	const heartRateI = parseFloat(document.getElementById('HeartRateI').value) || 0;
	const heartRateIds = ['HeartRateH', 'HeartRateG', 'HeartRateF', 'HeartRateE', 'HeartRateD', 'HeartRateC'];

	let currentValue = heartRateI;
	for (const id of heartRateIds) {
		currentValue -= 10;
		document.getElementById(id).value = currentValue;
	}
}
// 2区間移動平均を計算する関数
function calculateTwoPeriodMovingAverage(data) {
	const movingAverage = [];

	for (let i = 0; i < data.length - 1; i++) {
		const avgX = (data[i].x + data[i + 1].x) / 2; // xの2点平均
		const avgY = (data[i].y + data[i + 1].y) / 2; // yの2点平均
		movingAverage.push({ x: avgX, y: avgY });    // 平均点を追加
	}

	return movingAverage;
}

// グラフデータの更新と2区間移動平均線の追加
function updateChart() {
	const heartRates = [];
	const timeValues = [];

	// HeartRateC～HeartRateI と TimeValueA～TimeValueI を取得
	const heartRateIds = ['HeartRateC', 'HeartRateD', 'HeartRateE', 'HeartRateF', 'HeartRateG', 'HeartRateH', 'HeartRateI'];
	const timeValueIds = ['TimeValueC', 'TimeValueD', 'TimeValueE', 'TimeValueF', 'TimeValueG', 'TimeValueH', 'TimeValueI'];

	for (let i = 0; i < heartRateIds.length; i++) {
		const hr = parseFloat(document.getElementById(heartRateIds[i]).value) || 0;
		const tv = parseFloat(document.getElementById(timeValueIds[i]).value) || 0;
		heartRates.push(hr);
		timeValues.push(tv);
	}

	// 散布図データを生成
	const scatterData = heartRates.map((hr, index) => ({
		x: hr,
		y: timeValues[index]
	}));

	// 2区間移動平均を計算
	const twoPeriodMovingAverageData = calculateTwoPeriodMovingAverage(scatterData);

	// Chart.jsの更新
	if (window.mychart) {
		window.mychart.data.datasets[0].data = scatterData;

		// 2区間移動平均データセットを追加
		const twoPeriodMovingAverageDataset = {
			label: '移動平均',
			data: twoPeriodMovingAverageData,
			type: 'line',
			borderColor: 'rgba(255, 159, 64, 1)', // オレンジ色
			borderWidth: 8,
			fill: false,
			pointRadius: 0 // 線上のポイントを非表示にする
		};

		// 既存の2区間移動平均データセットを削除し、新しいものを追加
		window.mychart.data.datasets = window.mychart.data.datasets.filter(ds => ds.label !== '移動平均');
		window.mychart.data.datasets.push(twoPeriodMovingAverageDataset);

		window.mychart.update();
	}
}







