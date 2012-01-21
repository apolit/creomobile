
var jQT = $.jQTouch({
    icon: 'mp-icon.png',
    startupScreen: 'mp-startup.png',
    statusBar: 'black'
});

$(document).ready(function() {

    var shortName = 'Prayerbook';
    var version = '1.2.6';
    var displayName = 'Prayerbook';

});


function errorHandler(transaction, error) {
    alert('Oops. Error was '+error.message+' (Code '+error.code+')');
    return true;
}
