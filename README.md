# Annotation-Bag
Collects all of the annotated classes in a pre base based on configurations passed to the library.

# Intro
Annotations can tell a lot of information about your pre base. They can show:
- how many test methods you have
- how many and which classes were created by a specific user
<pre>
@author("bob")
</pre>
- a (class count/date) chart of how new functionality developed in comparison to the test base, which can serve as a proof of test driven development
<pre>
@created("2/25/2017")
</pre>
- a map of your requirements to your class names, where an id corresponds to a requirement
<pre>
@spec("453")
</pre>

These are just some of the things you can do, but the possiblities are endless.
This library was developed to make it easier to extract this information from your pre base as a whole.
