type ratio = {num: int, denom: int};;
(* Type ratio defined. *)

let add_ratio (r1 : ratio) (r2 : ratio) =
  {num = (r1.num) * (r2.denom) + (r2.num) * (r1.denom),
   denom = (r1.denom) * (r2.denom)};;
(* add_ratio : ratio -> ratio -> ratio = <fun> *)

add_ratio {num=1, denom=3} {num=2, denom=5};;
(* - : ratio = {num = 11; denom = 15} *)
