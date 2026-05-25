// java wrapper for vtkDecimatePro object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDecimatePro extends vtkPolyDataAlgorithm
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

  private native void SetPreserveTopology_8(int id0);
  public void SetPreserveTopology(int id0)
  {
    SetPreserveTopology_8(id0);
  }

  private native int GetPreserveTopology_9();
  public int GetPreserveTopology()
  {
    return GetPreserveTopology_9();
  }

  private native void PreserveTopologyOn_10();
  public void PreserveTopologyOn()
  {
    PreserveTopologyOn_10();
  }

  private native void PreserveTopologyOff_11();
  public void PreserveTopologyOff()
  {
    PreserveTopologyOff_11();
  }

  private native void SetFeatureAngle_12(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_12(id0);
  }

  private native double GetFeatureAngleMinValue_13();
  public double GetFeatureAngleMinValue()
  {
    return GetFeatureAngleMinValue_13();
  }

  private native double GetFeatureAngleMaxValue_14();
  public double GetFeatureAngleMaxValue()
  {
    return GetFeatureAngleMaxValue_14();
  }

  private native double GetFeatureAngle_15();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_15();
  }

  private native void SetSplitting_16(int id0);
  public void SetSplitting(int id0)
  {
    SetSplitting_16(id0);
  }

  private native int GetSplitting_17();
  public int GetSplitting()
  {
    return GetSplitting_17();
  }

  private native void SplittingOn_18();
  public void SplittingOn()
  {
    SplittingOn_18();
  }

  private native void SplittingOff_19();
  public void SplittingOff()
  {
    SplittingOff_19();
  }

  private native void SetSplitAngle_20(double id0);
  public void SetSplitAngle(double id0)
  {
    SetSplitAngle_20(id0);
  }

  private native double GetSplitAngleMinValue_21();
  public double GetSplitAngleMinValue()
  {
    return GetSplitAngleMinValue_21();
  }

  private native double GetSplitAngleMaxValue_22();
  public double GetSplitAngleMaxValue()
  {
    return GetSplitAngleMaxValue_22();
  }

  private native double GetSplitAngle_23();
  public double GetSplitAngle()
  {
    return GetSplitAngle_23();
  }

  private native void SetPreSplitMesh_24(int id0);
  public void SetPreSplitMesh(int id0)
  {
    SetPreSplitMesh_24(id0);
  }

  private native int GetPreSplitMesh_25();
  public int GetPreSplitMesh()
  {
    return GetPreSplitMesh_25();
  }

  private native void PreSplitMeshOn_26();
  public void PreSplitMeshOn()
  {
    PreSplitMeshOn_26();
  }

  private native void PreSplitMeshOff_27();
  public void PreSplitMeshOff()
  {
    PreSplitMeshOff_27();
  }

  private native void SetMaximumError_28(double id0);
  public void SetMaximumError(double id0)
  {
    SetMaximumError_28(id0);
  }

  private native double GetMaximumErrorMinValue_29();
  public double GetMaximumErrorMinValue()
  {
    return GetMaximumErrorMinValue_29();
  }

  private native double GetMaximumErrorMaxValue_30();
  public double GetMaximumErrorMaxValue()
  {
    return GetMaximumErrorMaxValue_30();
  }

  private native double GetMaximumError_31();
  public double GetMaximumError()
  {
    return GetMaximumError_31();
  }

  private native void SetAccumulateError_32(int id0);
  public void SetAccumulateError(int id0)
  {
    SetAccumulateError_32(id0);
  }

  private native int GetAccumulateError_33();
  public int GetAccumulateError()
  {
    return GetAccumulateError_33();
  }

  private native void AccumulateErrorOn_34();
  public void AccumulateErrorOn()
  {
    AccumulateErrorOn_34();
  }

  private native void AccumulateErrorOff_35();
  public void AccumulateErrorOff()
  {
    AccumulateErrorOff_35();
  }

  private native void SetErrorIsAbsolute_36(int id0);
  public void SetErrorIsAbsolute(int id0)
  {
    SetErrorIsAbsolute_36(id0);
  }

  private native int GetErrorIsAbsolute_37();
  public int GetErrorIsAbsolute()
  {
    return GetErrorIsAbsolute_37();
  }

  private native void SetAbsoluteError_38(double id0);
  public void SetAbsoluteError(double id0)
  {
    SetAbsoluteError_38(id0);
  }

  private native double GetAbsoluteErrorMinValue_39();
  public double GetAbsoluteErrorMinValue()
  {
    return GetAbsoluteErrorMinValue_39();
  }

  private native double GetAbsoluteErrorMaxValue_40();
  public double GetAbsoluteErrorMaxValue()
  {
    return GetAbsoluteErrorMaxValue_40();
  }

  private native double GetAbsoluteError_41();
  public double GetAbsoluteError()
  {
    return GetAbsoluteError_41();
  }

  private native void SetBoundaryVertexDeletion_42(int id0);
  public void SetBoundaryVertexDeletion(int id0)
  {
    SetBoundaryVertexDeletion_42(id0);
  }

  private native int GetBoundaryVertexDeletion_43();
  public int GetBoundaryVertexDeletion()
  {
    return GetBoundaryVertexDeletion_43();
  }

  private native void BoundaryVertexDeletionOn_44();
  public void BoundaryVertexDeletionOn()
  {
    BoundaryVertexDeletionOn_44();
  }

  private native void BoundaryVertexDeletionOff_45();
  public void BoundaryVertexDeletionOff()
  {
    BoundaryVertexDeletionOff_45();
  }

  private native void SetDegree_46(int id0);
  public void SetDegree(int id0)
  {
    SetDegree_46(id0);
  }

  private native int GetDegreeMinValue_47();
  public int GetDegreeMinValue()
  {
    return GetDegreeMinValue_47();
  }

  private native int GetDegreeMaxValue_48();
  public int GetDegreeMaxValue()
  {
    return GetDegreeMaxValue_48();
  }

  private native int GetDegree_49();
  public int GetDegree()
  {
    return GetDegree_49();
  }

  private native void SetInflectionPointRatio_50(double id0);
  public void SetInflectionPointRatio(double id0)
  {
    SetInflectionPointRatio_50(id0);
  }

  private native double GetInflectionPointRatioMinValue_51();
  public double GetInflectionPointRatioMinValue()
  {
    return GetInflectionPointRatioMinValue_51();
  }

  private native double GetInflectionPointRatioMaxValue_52();
  public double GetInflectionPointRatioMaxValue()
  {
    return GetInflectionPointRatioMaxValue_52();
  }

  private native double GetInflectionPointRatio_53();
  public double GetInflectionPointRatio()
  {
    return GetInflectionPointRatio_53();
  }

  private native long GetNumberOfInflectionPoints_54();
  public long GetNumberOfInflectionPoints()
  {
    return GetNumberOfInflectionPoints_54();
  }

  private native void SetOutputPointsPrecision_55(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_55(id0);
  }

  private native int GetOutputPointsPrecision_56();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_56();
  }

  public vtkDecimatePro() { super(); }

  public vtkDecimatePro(long id) { super(id); }
  public native long   VTKInit();

}
