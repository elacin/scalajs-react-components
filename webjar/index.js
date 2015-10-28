var React = require('react');
var ReactDOM = require('react-dom');
var injectTapEventPlugin = require('react-tap-event-plugin');

injectTapEventPlugin();

window.ReactDOM = ReactDOM;
window.React = React;
var mui = require("material-ui");
window.mui = mui;
