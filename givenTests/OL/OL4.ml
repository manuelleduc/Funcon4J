let rec
 (sort : 'a list -> 'a list) = function lst -> (match lst with
                                                   []           -> []
                                                 | [head :: tail] -> (insert head (sort tail)))
and
 (insert : 'a -> 'a list -> 'a list) = fun elt lst -> (match lst with
                                                          [] -> [elt]
                                                        | [head :: tail] -> if elt <= head
                                                                            then elt :: lst
                                                                            else head :: (insert elt tail))
;;
(* sort : 'a list -> 'a list = <fun>
   insert : 'a -> 'a list -> 'a list = <fun> 
*)

sort [6,2,5];;
(* - : int list = [2; 5; 6] *)

sort [3.14, 2.718];;
(* - : float list = [2.718; 3.14] *)
