type mutable_point = { mutable x: float, mutable y: float };;
(* Type mutable_point defined. *)

let translate p dx dy =
  p.x <- p.x +. dx; p.y <- p.y +. dy;;
(* translate : mutable_point -> float -> float -> unit = <fun> *)

let mypoint = {mutable x = 0.0, mutable y = 0.0 };;
(* mypoint : mutable_point = {x = 0.0; y = 0.0} *)

translate mypoint 1.0 2.0;;
(* - : unit = () *)

mypoint;;
(* - : mutable_point = {x = 1.0; y = 2.0} *)

