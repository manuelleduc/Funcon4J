match [ 1 ] with
    [] | [0 :: []] -> "bad"
  | [1 :: []]      -> "ok" ;;
(* - : string = "ok" *)
