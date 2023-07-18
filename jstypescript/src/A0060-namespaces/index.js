var MyNamespace;
(function (MyNamespace) {
    MyNamespace.nameNamespace = 'Lucas';
    var PersonNamespace = /** @class */ (function () {
        function PersonNamespace(name) {
            this.name = name;
        }
        return PersonNamespace;
    }());
    MyNamespace.PersonNamespace = PersonNamespace;
    var personNamespace = new PersonNamespace('Lucas');
    console.log(personNamespace);
    var AnotherNamespace;
    (function (AnotherNamespace) {
        AnotherNamespace.nameNamespace = 'Name in another namespace';
    })(AnotherNamespace = MyNamespace.AnotherNamespace || (MyNamespace.AnotherNamespace = {}));
})(MyNamespace || (MyNamespace = {}));
var PersonNamespace = new MyNamespace.PersonNamespace('Lucas');
console.log(PersonNamespace);
console.log(MyNamespace.nameNamespace);
console.log(MyNamespace.AnotherNamespace.nameNamespace);
/// <reference path="modulo/module.ts" />
console.log(MyNamespace.nameNamespace);
