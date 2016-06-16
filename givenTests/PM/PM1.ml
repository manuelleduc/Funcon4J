exception Match_failure;;

try (match 1 with
    2 -> 2
  | 3 -> 3
) with Match_failure -> 0;;
(* Uncaught exception: Match_failure *)
