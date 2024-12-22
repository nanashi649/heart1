const open = document.querySelector('#open');
const close = document.querySelector('#close');
const mask = document.querySelector('#mask');

//ここからモータルウィンドウ

//モータルウィンドウ3
const modal3 = document.querySelector('#modal3');
const open3 = document.querySelector('#open3');
const back3 = document.querySelector('#back3');

//モータルウィンドウ4
const modal4 = document.querySelector('#modal4');
const open4 = document.querySelector('#open4');
const back4 = document.querySelector('#back4');

//モータルウィンドウ5
const modal5 = document.querySelector('#modal5');
const open5 = document.querySelector('#open5');
const back5 = document.querySelector('#back5');

//モータルウィンドウ6
const modal6 = document.querySelector('#modal6');
const open6 = document.querySelector('#open6');
const back6 = document.querySelector('#back6');

//モータルウィンドウ7
const modal7 = document.querySelector('#modal7');
const open7 = document.querySelector('#open7');
const back7 = document.querySelector('#back7');

//モータルウィンドウ8
const modal8 = document.querySelector('#modal8');
const open8 = document.querySelector('#open8');
const back8 = document.querySelector('#back8');

//モータルウィンドウ9
const modal9 = document.querySelector('#modal9');
const open9 = document.querySelector('#open9');
const back9 = document.querySelector('#back9');

//モータルウィンドウ10
const modal10 = document.querySelector('#modal10');
const open10 = document.querySelector('#open10');
const back10 = document.querySelector('#back10');

//モータルウィンドウ11
const modal11 = document.querySelector('#modal11');
const open11 = document.querySelector('#open11');
const back11 = document.querySelector('#back11');

//モータルウィンドウ12
const modal12 = document.querySelector('#modal12');
const open12 = document.querySelector('#open12');
const back12 = document.querySelector('#back12');

//モータルウィンドウ13
const modal13 = document.querySelector('#modal13');
const open13 = document.querySelector('#open13');
const back13 = document.querySelector('#back13');

//モータルウィンドウ14
const modal14 = document.querySelector('#modal14');
const open14 = document.querySelector('#open14');
const back14 = document.querySelector('#back14');

//ここまでモータルウィンドウ



//ここからanimation
const showKeyframes = {
	opacity: [0, 1],
	visibility: 'visible',
};
const hideKeyframes = {
	opacity: [1, 0],
	visibility: 'hidden',
};
const options = {
	duration: 800,
	easing: 'ease',
	fill: 'forwards',
};

//ここまでanimation



//ここから モーダルウィンドウを開く

//モータルウィンドウ３ページ目
open3.addEventListener('click', () => {
	modal3.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ4ページ目
open4.addEventListener('click', () => {
	modal4.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ5ページ目
open5.addEventListener('click', () => {
	modal5.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ6ページ目
open6.addEventListener('click', () => {
	modal6.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ7ページ目
open7.addEventListener('click', () => {
	modal7.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ8ページ目
open8.addEventListener('click', () => {
	modal8.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ9ページ目
open9.addEventListener('click', () => {
	modal9.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ10ページ目
open10.addEventListener('click', () => {
	modal10.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ11ページ目
open11.addEventListener('click', () => {
	modal11.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ12ページ目
open12.addEventListener('click', () => {
	modal12.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ13ページ目
open13.addEventListener('click', () => {
	modal13.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モータルウィンドウ14ページ目
open14.addEventListener('click', () => {
	modal14.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//ここまで開く




//ここから戻る

//3ページに戻る
back3.addEventListener('click', () => {
	modal3.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//4ページに戻る
back4.addEventListener('click', () => {
	modal4.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//5ページに戻る
back5.addEventListener('click', () => {
	modal5.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//6ページに戻る
back6.addEventListener('click', () => {
	modal6.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//7ページに戻る
back7.addEventListener('click', () => {
	modal7.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//8ページに戻る
back8.addEventListener('click', () => {
	modal8.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//9ページに戻る
back9.addEventListener('click', () => {
	modal9.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//10ページに戻る
back10.addEventListener('click', () => {
	modal10.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//11ページに戻る
back11.addEventListener('click', () => {
	modal11.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//12ページに戻る
back12.addEventListener('click', () => {
	modal12.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//13ページに戻る
back13.addEventListener('click', () => {
	modal13.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});



function showPage(pageId) {
	//activeなページを非表示
	const activepage = document.getElementsByClassName('page.active')[0];
	if (activepage) {
		activepage.classList.remove('page.active');
		activepage.classList.add('page');
	}
	const nextpage = document.getElementById(pageId);
	if (nextpage) {
		nextpage.classList.remove('page');
		nextpage.classList.add('page.active');
	}
};




