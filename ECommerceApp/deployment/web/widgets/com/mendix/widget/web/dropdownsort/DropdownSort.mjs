import{Children as t,createElement as e,useEffect as n,useState as o,useCallback as i,useRef as r,useContext as a,useMemo as l}from"react";import{createPortal as u}from"react-dom";var d,s={exports:{}};
/*!
  Copyright (c) 2017 Jed Watson.
  Licensed under the MIT License (MIT), see
  http://jedwatson.github.io/classnames
*/d=s,function(){var t={}.hasOwnProperty;function e(){for(var n=[],o=0;o<arguments.length;o++){var i=arguments[o];if(i){var r=typeof i;if("string"===r||"number"===r)n.push(i);else if(Array.isArray(i)&&i.length){var a=e.apply(null,i);a&&n.push(a)}else if("object"===r)for(var l in i)t.call(i,l)&&i[l]&&n.push(l)}}return n.join(" ")}d.exports?(e.default=e,d.exports=e):window.classNames=e}();var c=s.exports;const p=({className:n,bootstrapStyle:o,children:i})=>t.count(i)>0?e("div",{className:c("alert alert-".concat(o),n)},i):null;function v(t,e){const[a,l]=o(),u=i((()=>{const e=null==t?void 0:t.getBoundingClientRect();var n,o;o=a,(n=e)&&o&&n.height===o.height&&n.width===o.width&&n.bottom===o.bottom&&n.top===o.top&&n.left===o.left&&n.right===o.right||l(e)}),[a,t]);return function(t){const e=r(),o=i((()=>{t(),e.current=window.requestAnimationFrame(o)}),[t]);n((()=>{if(t)return e.current=window.requestAnimationFrame(o),()=>{window.cancelAnimationFrame(e.current)}}),[t,o])}(e?u:void 0),a}function m(t){var a,l,d,s,p,m,f;const[y,b]=o(null!==(d=null!==(l=null===(a=t.defaultOption)||void 0===a?void 0:a.caption)&&void 0!==l?l:t.emptyOptionCaption)&&void 0!==d?d:""),[h,w]=o(null!==(s=t.defaultOption)&&void 0!==s?s:{caption:null!==(p=t.emptyOptionCaption)&&void 0!==p?p:"",value:""}),[g,C]=o(!1),[x,N]=o(0),[k,O]=o(null!==(m=t.defaultDirection)&&void 0!==m?m:"asc"),D=r(null),S=r(null),A=v(D.current,g),E=i((t=>{b(t.caption),w(t),C(!1)}),[]);var I,R;n((()=>{const t=t=>{if(Array.isArray(I)){if(I.some((e=>!e.current||e.current.contains(t.target))))return}else if(!I.current||I.current.contains(t.target))return;R()};return document.addEventListener("mousedown",t),document.addEventListener("touchstart",t),()=>{document.removeEventListener("mousedown",t),document.removeEventListener("touchstart",t)}}),[I=[D,S],R=()=>C(!1)]),n((()=>{var e;h&&(null===(e=t.updateSort)||void 0===e||e.call(t,h,k))}),[k,h]);const q=!h||y===t.emptyOptionCaption,B=u(e("ul",{ref:S,id:"".concat(t.name,"-dropdown-list"),className:"dropdown-list",role:"menu","data-focusindex":0,style:{position:"fixed",width:x,top:null==A?void 0:A.bottom,left:null==A?void 0:A.left}},t.options.map(((n,o)=>e("li",{className:c({"filter-selected":(null==h?void 0:h.value)===n.value}),key:o,onClick:t=>{t.preventDefault(),t.stopPropagation(),E(n)},onKeyDown:e=>{var i,r,a,l;"Enter"===e.key||" "===e.key?(e.preventDefault(),e.stopPropagation(),E(n)):"Tab"===e.key&&o+1===t.options.length?(e.preventDefault(),C(!1),null===(r=null===(i=D.current)||void 0===i?void 0:i.querySelector("button"))||void 0===r||r.focus()):("Tab"===e.key&&e.shiftKey&&0===o||"Escape"===e.key)&&(e.preventDefault(),C(!1),null===(l=null===(a=D.current)||void 0===a?void 0:a.querySelector("input"))||void 0===l||l.focus())},role:"menuitem",tabIndex:0},e("div",{className:"filter-label"},n.caption))))),document.body),L=i((()=>{C((t=>!t)),setTimeout((()=>{var t,e;null===(e=null===(t=S.current)||void 0===t?void 0:t.querySelector("li.filter-selected"))||void 0===e||e.focus()}),10)}),[]);return e("div",{className:c("dropdown-container",t.className),"data-focusindex":null!==(f=t.tabIndex)&&void 0!==f?f:0,ref:D,style:t.styles},e("div",{className:"dropdown-triggerer-wrapper"},e("input",{value:q?"":y,placeholder:q?t.emptyOptionCaption:void 0,className:"form-control dropdown-triggerer",onClick:L,onKeyDown:t=>{"Enter"!==t.key&&" "!==t.key||(t.preventDefault(),t.stopPropagation(),L())},"aria-haspopup":!0,ref:t=>{t&&t.clientWidth&&N(t.clientWidth)},"aria-expanded":g,"aria-controls":"".concat(t.name,"-dropdown-list"),"aria-label":t.screenReaderInputCaption}),e("button",{"aria-label":t.screenReaderButtonCaption,className:c("btn btn-default btn-sort",{"icon-asc":"asc"===k,"icon-desc":"desc"===k}),onClick:()=>O((t=>"asc"===t?"desc":"asc"))})),g&&B)}function f(t){var n,o,r,u,d,s,c;const v=null!==(n=window["com.mendix.widgets.web.sortable.sortContext"])&&void 0!==n?n:{},f=e(p,{bootstrapStyle:"danger"},"The Drop-down sort widget must be placed inside the header of the Gallery widget."),{sortDispatcher:y,attributes:b,initialSort:h}=null!==(o=a(v))&&void 0!==o?o:{};let w,g;const C=l((()=>{var e,n,o;return[{caption:null!==(n=null===(e=t.emptyOptionCaption)||void 0===e?void 0:e.value)&&void 0!==n?n:"",value:""},...null!==(o=null==b?void 0:b.map((t=>({caption:t.caption,value:t.attribute.id}))))&&void 0!==o?o:[]]}),[b,null===(r=t.emptyOptionCaption)||void 0===r?void 0:r.value]),x=i(((t,e)=>{const n=null==b?void 0:b.find((e=>e.attribute.id===t.value));y({getSortCondition:()=>function(t,e,n){if(!t||!t.sortable||!n)return;const{id:o}=t;return[o,e]}(null==n?void 0:n.attribute,e,t)})}),[b,y]);if(!y||!b)return f;if(h&&h.length>0){const[t]=h,[e,n]=t;e&&(w=C.find((t=>t.value===String(e)))),n&&(g=n)}return e(m,{key:null!==(u=null==w?void 0:w.value)&&void 0!==u?u:"sort-component",className:t.class,defaultDirection:g,defaultOption:w,emptyOptionCaption:null===(d=t.emptyOptionCaption)||void 0===d?void 0:d.value,name:t.name,options:C,screenReaderButtonCaption:null===(s=t.screenReaderButtonCaption)||void 0===s?void 0:s.value,screenReaderInputCaption:null===(c=t.screenReaderInputCaption)||void 0===c?void 0:c.value,styles:t.style,tabIndex:t.tabIndex,updateSort:x})}p.displayName="Alert";export{f as DropdownSort};
