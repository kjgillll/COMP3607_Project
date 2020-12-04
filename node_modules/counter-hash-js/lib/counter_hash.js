(function() {
  var CounterHash, root;

  CounterHash = (function() {
    CounterHash.VERSION = '0.1.2';

    function CounterHash(dir) {
      this.values = {};
    }

    CounterHash.prototype.value = function(key) {
      var n;
      n = this.values[key];
      if (n) {
        return n;
      } else {
        return 0;
      }
    };

    CounterHash.prototype.sum = function() {
      var i, key, keys, len, total;
      total = 0;
      keys = Object.getOwnPropertyNames(this.values);
      for (i = 0, len = keys.length; i < len; i++) {
        key = keys[i];
        total = total + this.value(key);
      }
      return total;
    };

    CounterHash.prototype.increment = function(key) {
      var n;
      if (key) {
        n = this.values[key];
        if (n) {
          return this.values[key] = n + 1;
        } else {
          return this.values[key] = 1;
        }
      }
    };

    CounterHash.prototype.decrement = function(key) {
      var n;
      if (key) {
        n = this.values[key];
        if (n) {
          return this.values[key] = n - 1;
        } else {
          return this.values[key] = -1;
        }
      }
    };

    CounterHash.prototype.add = function(key, x) {
      var n;
      if (key && x) {
        n = this.values[key];
        if (n) {
          return this.values[key] = n + x;
        } else {
          return this.values[key] = x;
        }
      }
    };

    CounterHash.prototype.subtract = function(key, x) {
      var n;
      if (key && x) {
        n = this.values[key];
        if (n) {
          return this.values[key] = n - x;
        } else {
          return this.values[key] = x;
        }
      }
    };

    CounterHash.prototype.sorted_keys = function() {
      var i, key, keys, len, list;
      list = [];
      keys = Object.getOwnPropertyNames(this.values);
      for (i = 0, len = keys.length; i < len; i++) {
        key = keys[i];
        list.push(key);
      }
      return list.sort();
    };

    CounterHash.prototype.sorted_tuples = function() {
      var i, key, keys, len, list, val;
      list = [];
      keys = this.sorted_keys();
      for (i = 0, len = keys.length; i < len; i++) {
        key = keys[i];
        val = this.value(key);
        list.push([key, val]);
      }
      return list.sort();
    };

    return CounterHash;

  })();

  root = typeof exports !== "undefined" && exports !== null ? exports : this;

  root.CounterHash = CounterHash;

}).call(this);
