This is a dummy project that illustrates how I use ENSIME. I have
trouble describing the sheer immensity of the probability that I'm
doing something terribly wrong. Still, this project is here in order
to describe the issues I'm having.

There are four files of note:

- `project/build/Trauma.scala` - SBT build file that defines three
  subprojects: `trauma-util`, `trauma-model`, and `trauma-core`.

- `trauma-util/src/main/scala/A.scala` - defines `trauma.util.A`.
- `trauma-model/src/main/scala/B.scala` - defines `trauma.util.B`, which depends on `trauma.util.A`.
- `trauma-core/src/main/scala/C.scala` - defines `trauma.util.C`, which depends on `trauma.util.A` and `trauma.util.B`.

The entire deal compiles, but ENSIME fails to type-check the imports
in `B.scala` and `C.scala`. I left comments in the code indicating
exactly what's amiss.

My ENSIME files are also checked in; see `trauma-*/.ensime`.
