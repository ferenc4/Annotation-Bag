# Annotation-Bag [![Build Status](https://travis-ci.org/ferenc4/Annotation-Bag.svg?branch=master)](https://travis-ci.org/ferenc4/Annotation-Bag) <!--[![codecov](https://codecov.io/gh/ferenc4/Annotation-Bag/branch/master/graph/badge.svg)](https://codecov.io/gh/ferenc4/Annotation-Bag)--> [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
The library collects and filters annotations in a codebase to allow users to extract meaningful information for documentation from Java annotations.

# Intro
Annotations can tell a lot of information about your code base. They can show:
- how many test methods you have
<pre>
@Test
</pre>
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
This library was developed to make it easier to extract this information from your code base as a whole.

# Requirements
## Files and annotations
1. As a user I should be able to load and compile java files that are not on the classpath.</li>
2. As a user I should be able to view the list of java files on the classpath grouped by annotations.
3. As a user I should be able to view the list of annotations grouped by java files on the classpath.

## Filters
4. As a user I should be able to view all the files and annotations in a given codebase.
5. As a user I should be able to filter annotations by type.
6. As a user I should be able to filter annotations by value.
7. As a user I should be able to filter files by prefix.
8. As a user I should be able to filter files by suffix, while maintaining the ".java" file extension.