
class CounterHash

  @VERSION: '0.1.2'

  constructor: (dir) ->
    @values = {}

  value: (key) ->
    n = @values[key]
    if n
      n
    else
      0
      
  sum: ->
    total = 0
    keys = Object.getOwnPropertyNames(@values)
    for key in keys
      total = total + this.value(key)
    total

  increment: (key) ->
    if key
      n = @values[key]
      if n
        @values[key] = n + 1
      else
        @values[key] = 1     

  decrement: (key) ->
    if key
      n = @values[key]
      if n
        @values[key] = n - 1
      else
        @values[key] = -1

  add: (key, x) ->
    if key and x
      n = @values[key]
      if n
        @values[key] = n + x
      else
        @values[key] = x 

  subtract: (key, x) ->
    if key and x
      n = @values[key]
      if n
        @values[key] = n - x
      else
        @values[key] = x

  sorted_keys: ->
    list = []
    keys = Object.getOwnPropertyNames(@values)
    for key in keys
      list.push(key)
    list.sort()

  sorted_tuples: ->
    list = []
    keys = this.sorted_keys()
    for key in keys
      val = this.value(key)
      list.push([key, val])
    list.sort()


root = exports ? this
root.CounterHash = CounterHash
