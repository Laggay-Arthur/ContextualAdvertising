function click_campaign(e) {
    $.post('/adgroups', { key1: 'value1', key2: 'value2' }, function(result) {
        alert(result);
    });
}