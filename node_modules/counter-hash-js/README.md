## counter-hash-js

### Purpose

A Node.js library implementing a simple CounterHash class, for incrementing and decrementing keys.

Often it is useful to traverse some data structure, accumulating conters in the process.
Class CounterHash provides functions to increment, decrement, add, subtract, and obtain 
the sum, values, and sorted-keys of the hash.

### Examples

#### Setup

Add counter-hash-js to your project or package.json file:
```
npm install counter-hash-js
```

Require counter-hash-js in your code:
```
CounterHash  = require("counter-hash-js").CounterHash
```

Note: this library is implemented with CoffeeScript, and these examples are also in CoffeeScript.

#### CounterHash

Methods value(key), increment(key), decrement(key), add(key, n), subtract(key, n), value(key),
sum(), sorted_keys(), and sorted_tuples() are available.


``` 
h = new CounterHash()
h.increment('a')
h.increment('a')
h.increment('b')
h.decrement('q')
h.increment('z')

h.sum()       -> 3

h.value('a')  -> 2
h.value('x')  -> undefined

h.add('x', 100)
h.subtract('x', 7)

h.value('x')  -> 93

h.sorted_keys() -> [ 'a', 'b', 'q', 'x', 'z' ]

h.sorted_tuples() -> [ ['a', 2], ['b', 1],['q', -1], ['z', 1] ]

CounterHash.VERSION  -> '0.1.2'
```

### Release History

* 2015-02-20   v0.1.2  Added method 'sorted_tuples()'.
* 2015-01-13   v0.1.1  Docs updated.
* 2015-01-13   v0.1.0  Initial working version.
* 2015-01-13   v0.0.2  alpha 2
* 2015-01-13   v0.0.1  alpha 1
