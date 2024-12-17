//		chartを検索し変数に入れる
const ctx = document.getElementById('chart').getContext('2d');
		
window.mychart = new Chart(ctx,{
    type:'scatter',
    data:{
        datasets:[{
            label:'LT値測定',
            data:[],
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1
        }]
    },
    options:{
//				反応するように
        responsive: true,
        scales:{
            x:{
                type:'linear',
                min:60,
                max:220,
                ticks:{
                    stepSize:20,//メモリの間隔を20
                    callback: function(value) {
                 return value + ' 回'; // ラベルに「bpm」を追加
                 }
                },
                title:{
                    display:true,
                    text:'指定心拍数(回)'
                }
            },
            y:{
                beginAtZero:true,//０からスタート
                min: 0,
                max: 200,
                ticks:{
                    stepSize: 20, //メモリの間隔を20に
                    callback: function(value) {
                    return value + ' 秒'; // ラベルに「s」を追加
                    }
                },
                title:{
                    display:true,
                    text:'53%の心拍数に戻るまでの時間(秒)'
                }
            }
        }
    }
  


    
});

