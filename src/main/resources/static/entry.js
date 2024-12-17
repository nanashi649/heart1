const open = document.querySelector('#open');
const close = document.querySelector('#close');
const modal = document.querySelector('#modal');
const mask = document.querySelector('#mask');
//モータルウィンドウ２
const open2 = document.querySelector('#open2');
const modal2 = document.querySelector('#modal2')
const back1 = document.querySelector('#back1');

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



// モーダルウィンドウを開く
open.addEventListener('click', () => {
  modal.animate(showKeyframes, options);
  mask.animate(showKeyframes, options);
});

//モータルウィンドウ２ページ目
open2.addEventListener('click', () => {
  modal2.animate(showKeyframes, options);
  mask.animate(showKeyframes, options);
});

//戻る

back1.addEventListener('click',() =>{
  modal.animate(showKeyframes,options);
  mask.animate(showKeyframes, options);
})



function showPage(pageId) {
  //activeなページを非表示
  const activepage = document.getElementsByClassName('page.active')[0];
      if(activepage){
      activepage.classList.remove ('page.active');
      activepage.classList.add('page');
      }
  const nextpage = document.getElementById(pageId);
  if(nextpage){
    nextpage.classList.remove ('page');
    nextpage.classList.add('page.active');
  }
  };




