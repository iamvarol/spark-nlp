package com.jsl.nlp.annotators.param

/**
  * Created by saif on 24/06/17.
  */
trait SerializedAnnotatorComponent[TargetAnnotatorApproach <: WritableAnnotatorComponent] {
  def deserialize: TargetAnnotatorApproach
}
