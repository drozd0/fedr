define('pages/search', [], function () {

    function Page() {
        $('body').on('click', '.js-delete-item', this.onDelete.bind(this));
    }

    Page.prototype.onDelete = function (e) {
        e.preventDefault();
        var target = e.currentTarget;

        var message = "Вы уверены что хотите удалить: " + $(target).attr('data-element-id');
        var sure = confirm(message);

        if (sure) {
            $.post($(target).attr("data-delete-url"), function (data) {
                location.reload();
            });
        }
    };

    return Page;

});
