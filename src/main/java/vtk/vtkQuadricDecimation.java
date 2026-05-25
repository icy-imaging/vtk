// java wrapper for vtkQuadricDecimation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuadricDecimation extends vtkPolyDataAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetTargetReduction_4(double id0);
  public void SetTargetReduction(double id0)
  {
    SetTargetReduction_4(id0);
  }

  private native double GetTargetReductionMinValue_5();
  public double GetTargetReductionMinValue()
  {
    return GetTargetReductionMinValue_5();
  }

  private native double GetTargetReductionMaxValue_6();
  public double GetTargetReductionMaxValue()
  {
    return GetTargetReductionMaxValue_6();
  }

  private native double GetTargetReduction_7();
  public double GetTargetReduction()
  {
    return GetTargetReduction_7();
  }

  private native void SetAttributeErrorMetric_8(int id0);
  public void SetAttributeErrorMetric(int id0)
  {
    SetAttributeErrorMetric_8(id0);
  }

  private native int GetAttributeErrorMetric_9();
  public int GetAttributeErrorMetric()
  {
    return GetAttributeErrorMetric_9();
  }

  private native void AttributeErrorMetricOn_10();
  public void AttributeErrorMetricOn()
  {
    AttributeErrorMetricOn_10();
  }

  private native void AttributeErrorMetricOff_11();
  public void AttributeErrorMetricOff()
  {
    AttributeErrorMetricOff_11();
  }

  private native void SetVolumePreservation_12(int id0);
  public void SetVolumePreservation(int id0)
  {
    SetVolumePreservation_12(id0);
  }

  private native int GetVolumePreservation_13();
  public int GetVolumePreservation()
  {
    return GetVolumePreservation_13();
  }

  private native void VolumePreservationOn_14();
  public void VolumePreservationOn()
  {
    VolumePreservationOn_14();
  }

  private native void VolumePreservationOff_15();
  public void VolumePreservationOff()
  {
    VolumePreservationOff_15();
  }

  private native void SetRegularize_16(int id0);
  public void SetRegularize(int id0)
  {
    SetRegularize_16(id0);
  }

  private native int GetRegularize_17();
  public int GetRegularize()
  {
    return GetRegularize_17();
  }

  private native void RegularizeOn_18();
  public void RegularizeOn()
  {
    RegularizeOn_18();
  }

  private native void RegularizeOff_19();
  public void RegularizeOff()
  {
    RegularizeOff_19();
  }

  private native void SetRegularization_20(double id0);
  public void SetRegularization(double id0)
  {
    SetRegularization_20(id0);
  }

  private native double GetRegularization_21();
  public double GetRegularization()
  {
    return GetRegularization_21();
  }

  private native void SetWeighBoundaryConstraintsByLength_22(int id0);
  public void SetWeighBoundaryConstraintsByLength(int id0)
  {
    SetWeighBoundaryConstraintsByLength_22(id0);
  }

  private native int GetWeighBoundaryConstraintsByLength_23();
  public int GetWeighBoundaryConstraintsByLength()
  {
    return GetWeighBoundaryConstraintsByLength_23();
  }

  private native void WeighBoundaryConstraintsByLengthOn_24();
  public void WeighBoundaryConstraintsByLengthOn()
  {
    WeighBoundaryConstraintsByLengthOn_24();
  }

  private native void WeighBoundaryConstraintsByLengthOff_25();
  public void WeighBoundaryConstraintsByLengthOff()
  {
    WeighBoundaryConstraintsByLengthOff_25();
  }

  private native void SetBoundaryWeightFactor_26(double id0);
  public void SetBoundaryWeightFactor(double id0)
  {
    SetBoundaryWeightFactor_26(id0);
  }

  private native double GetBoundaryWeightFactor_27();
  public double GetBoundaryWeightFactor()
  {
    return GetBoundaryWeightFactor_27();
  }

  private native boolean GetMapPointData_28();
  public boolean GetMapPointData()
  {
    return GetMapPointData_28();
  }

  private native void SetMapPointData_29(boolean id0);
  public void SetMapPointData(boolean id0)
  {
    SetMapPointData_29(id0);
  }

  private native void MapPointDataOn_30();
  public void MapPointDataOn()
  {
    MapPointDataOn_30();
  }

  private native void MapPointDataOff_31();
  public void MapPointDataOff()
  {
    MapPointDataOff_31();
  }

  private native void SetScalarsAttribute_32(int id0);
  public void SetScalarsAttribute(int id0)
  {
    SetScalarsAttribute_32(id0);
  }

  private native int GetScalarsAttribute_33();
  public int GetScalarsAttribute()
  {
    return GetScalarsAttribute_33();
  }

  private native void ScalarsAttributeOn_34();
  public void ScalarsAttributeOn()
  {
    ScalarsAttributeOn_34();
  }

  private native void ScalarsAttributeOff_35();
  public void ScalarsAttributeOff()
  {
    ScalarsAttributeOff_35();
  }

  private native void SetVectorsAttribute_36(int id0);
  public void SetVectorsAttribute(int id0)
  {
    SetVectorsAttribute_36(id0);
  }

  private native int GetVectorsAttribute_37();
  public int GetVectorsAttribute()
  {
    return GetVectorsAttribute_37();
  }

  private native void VectorsAttributeOn_38();
  public void VectorsAttributeOn()
  {
    VectorsAttributeOn_38();
  }

  private native void VectorsAttributeOff_39();
  public void VectorsAttributeOff()
  {
    VectorsAttributeOff_39();
  }

  private native void SetNormalsAttribute_40(int id0);
  public void SetNormalsAttribute(int id0)
  {
    SetNormalsAttribute_40(id0);
  }

  private native int GetNormalsAttribute_41();
  public int GetNormalsAttribute()
  {
    return GetNormalsAttribute_41();
  }

  private native void NormalsAttributeOn_42();
  public void NormalsAttributeOn()
  {
    NormalsAttributeOn_42();
  }

  private native void NormalsAttributeOff_43();
  public void NormalsAttributeOff()
  {
    NormalsAttributeOff_43();
  }

  private native void SetTCoordsAttribute_44(int id0);
  public void SetTCoordsAttribute(int id0)
  {
    SetTCoordsAttribute_44(id0);
  }

  private native int GetTCoordsAttribute_45();
  public int GetTCoordsAttribute()
  {
    return GetTCoordsAttribute_45();
  }

  private native void TCoordsAttributeOn_46();
  public void TCoordsAttributeOn()
  {
    TCoordsAttributeOn_46();
  }

  private native void TCoordsAttributeOff_47();
  public void TCoordsAttributeOff()
  {
    TCoordsAttributeOff_47();
  }

  private native void SetTensorsAttribute_48(int id0);
  public void SetTensorsAttribute(int id0)
  {
    SetTensorsAttribute_48(id0);
  }

  private native int GetTensorsAttribute_49();
  public int GetTensorsAttribute()
  {
    return GetTensorsAttribute_49();
  }

  private native void TensorsAttributeOn_50();
  public void TensorsAttributeOn()
  {
    TensorsAttributeOn_50();
  }

  private native void TensorsAttributeOff_51();
  public void TensorsAttributeOff()
  {
    TensorsAttributeOff_51();
  }

  private native void SetScalarsWeight_52(double id0);
  public void SetScalarsWeight(double id0)
  {
    SetScalarsWeight_52(id0);
  }

  private native void SetVectorsWeight_53(double id0);
  public void SetVectorsWeight(double id0)
  {
    SetVectorsWeight_53(id0);
  }

  private native void SetNormalsWeight_54(double id0);
  public void SetNormalsWeight(double id0)
  {
    SetNormalsWeight_54(id0);
  }

  private native void SetTCoordsWeight_55(double id0);
  public void SetTCoordsWeight(double id0)
  {
    SetTCoordsWeight_55(id0);
  }

  private native void SetTensorsWeight_56(double id0);
  public void SetTensorsWeight(double id0)
  {
    SetTensorsWeight_56(id0);
  }

  private native double GetScalarsWeight_57();
  public double GetScalarsWeight()
  {
    return GetScalarsWeight_57();
  }

  private native double GetVectorsWeight_58();
  public double GetVectorsWeight()
  {
    return GetVectorsWeight_58();
  }

  private native double GetNormalsWeight_59();
  public double GetNormalsWeight()
  {
    return GetNormalsWeight_59();
  }

  private native double GetTCoordsWeight_60();
  public double GetTCoordsWeight()
  {
    return GetTCoordsWeight_60();
  }

  private native double GetTensorsWeight_61();
  public double GetTensorsWeight()
  {
    return GetTensorsWeight_61();
  }

  private native double GetActualReduction_62();
  public double GetActualReduction()
  {
    return GetActualReduction_62();
  }

  public vtkQuadricDecimation() { super(); }

  public vtkQuadricDecimation(long id) { super(id); }
  public native long   VTKInit();

}
