const open = document.querySelector('#open');
const close = document.querySelector('#close');
const insertLT = document.querySelector('#insertLT');
const mask = document.querySelector('#mask');


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
	insertLT.animate(showKeyframes, options);
	mask.animate(showKeyframes, options);
});

//モーダルウィンドウを閉じる
close.addEventListener('click', () => {
	insertLT.animate(hideKeyframes, options);
	mask.animate(hideKeyframes, options);
})


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




