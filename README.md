# Annotation-Bag
Collects all of the annotated classes in a code base based on configurations passed to the library.

# Intro
Annotations can tell a lot of information about your code base. They can show:
<ul>
<li> how many test methods you have</li>
<li> how many and which classes were created by a specific user</li>
<code>
    @author("bob")
</code>
<li> a (class count/date) chart of how new functionality developed in comparison to the test base, which can serve as a proof of test driven development</li>
<code>
    @created("2/25/2017")
</code>
<li> a map of your requirements to your class names, where an id corresponds to a requirement</li>
<code>
    @spec("453")
</code>
</ul>
These are just some of the things you can do, but the possiblities are endless.
This library was developed to make it easier to extract this information from your code base as a whole.
