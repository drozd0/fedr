define('pages/add', ['CodeMirror', 'CodeMirrorJs'], function () {

    function Page() {
        this.editor = CodeMirror.fromTextArea(document.getElementById("json"), {
            lineNumbers: true,
            height: "150px"
        });
    }

    return Page;
});