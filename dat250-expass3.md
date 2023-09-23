# Dat250 - Assignment 3

In this assignment we will look at MongoDB, how it works and some of the essential methods that we are
going to use. The assignment is split into two “experiments”, the first one contains the basic methods,
whilst the second covers some more advanced operations.


## Experiment 1

After the install I started following the guidelines, and tried using the different commands.

### Insert

Using the _insertOne()_ function I created a new table called dogs, containing the dog “Pågen”, which is of
item “border-collie”, in hindsight I should’ve used a the term _breed_ instead of _item_ as the first attribute,
as it would have been more clear.
![insert]([http://url/to/img.png](https://github.com/MikalDr/dat250assignment1/blob/main/expass3/insert1.png))

I also added two extra dogs, to use for the query later on.
![insert2]([http://url/to/img.png](https://github.com/MikalDr/dat250assignment1/blob/main/expass3/insert2.png))

### Query

Using the command _db.dogs.find()_ I queried the database once without arguments, and the second time
to only retrieve the “Japanese-spitz” from the table.
![Query]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/Query.png])

### Update

I then decided to use the update function to update one of the entries, so I added a new type of dog, and
named it Kaspar
![Update]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/KasparDog.png])

### Remove

I made a new dog using the insert and named him Adrian, which I quickly removed afterwards using the
remove function.
![Remove]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/db%20without%20adrian.png])

### Bulkwrite
Using bulkwrite I decided to add two new dogs, “Adrian” and “Toggi”, I also updated one of our previous
dogs “Kaspar” to the species ( _item)_ “Leonberger.
![Bulkwrite]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/bulkwrite.png])

Afterwards the table looked like this, containing the new inserts, and the update was done properly.
![BulkwriteTable]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/bulkwriteTable.png])

## Experiment 2

This part covers the Aggregation and the MapReduce method.
To better make use of these methods added 2 additional attributes to the entries in my table, age and
size.

### Aggregate
![newTable]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/db%20with%20ages.png])
Using a basic aggregate function, I queried the combined age of all the dogs of size _large_ which gave me
the result of 19.
![Aggregate]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/aggregate1.png])

### MapReduce Examples

Following the steps in the examples guide, I copied the different commands, till I ended up with this
output.
![example1]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/2.png])
Following the next steps, implementing the new map and reduce functions, and using the query to sort
for __id : 1_ , we get this output.
![example2]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/1.png])
### MapReduce self-implementation

After trying the map-reduce examples, I decided to add my own function. And do my own map-reduce. I
figured creating a function for viewing the dogs ages in _dog years_ would be a fitting function. The
function itself was quite simple to implement, and it worked as expected. And saves us time as we don’t
need to multiply it ourselves later.
![example2]([https://github.com/MikalDr/dat250assignment1/blob/main/expass3/mapReduce.png])
MapReduce functions are quite useful as they allow us to extract data from a database and do some
processing on it before displaying it. Reducing the need to alter It later.


## Technical difficulties

- Starting this assignment, I downloaded the MongoDB Compass. But It was quite cumbersome
    using, and I could not find any way to proceed. This was solved by downloading MongoSH.
- Mongosh did not like the copied commands from the examples as they contained linebreaks, so
    in order to use the commands I have to put it on one line, if not there were errors.


