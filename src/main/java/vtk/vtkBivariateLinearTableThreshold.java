// java wrapper for vtkBivariateLinearTableThreshold object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBivariateLinearTableThreshold extends vtkTableAlgorithm
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

  private native void SetInclusive_4(int id0);
  public void SetInclusive(int id0)
  {
    SetInclusive_4(id0);
  }

  private native int GetInclusive_5();
  public int GetInclusive()
  {
    return GetInclusive_5();
  }

  private native void AddColumnToThreshold_6(long id0,long id1);
  public void AddColumnToThreshold(long id0,long id1)
  {
    AddColumnToThreshold_6(id0,id1);
  }

  private native int GetNumberOfColumnsToThreshold_7();
  public int GetNumberOfColumnsToThreshold()
  {
    return GetNumberOfColumnsToThreshold_7();
  }

  private native void ClearColumnsToThreshold_8();
  public void ClearColumnsToThreshold()
  {
    ClearColumnsToThreshold_8();
  }

  private native long GetSelectedRowIds_9(int id0);
  public vtkIdTypeArray GetSelectedRowIds(int id0)
  {
    long temp = GetSelectedRowIds_9(id0);

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_10();
  public void Initialize()
  {
    Initialize_10();
  }

  private native void AddLineEquation_11(double id0,double id1,double id2);
  public void AddLineEquation(double id0,double id1,double id2)
  {
    AddLineEquation_11(id0,id1,id2);
  }

  private native void ClearLineEquations_12();
  public void ClearLineEquations()
  {
    ClearLineEquations_12();
  }

  private native int GetLinearThresholdType_13();
  public int GetLinearThresholdType()
  {
    return GetLinearThresholdType_13();
  }

  private native void SetLinearThresholdType_14(int id0);
  public void SetLinearThresholdType(int id0)
  {
    SetLinearThresholdType_14(id0);
  }

  private native void SetLinearThresholdTypeToAbove_15();
  public void SetLinearThresholdTypeToAbove()
  {
    SetLinearThresholdTypeToAbove_15();
  }

  private native void SetLinearThresholdTypeToBelow_16();
  public void SetLinearThresholdTypeToBelow()
  {
    SetLinearThresholdTypeToBelow_16();
  }

  private native void SetLinearThresholdTypeToNear_17();
  public void SetLinearThresholdTypeToNear()
  {
    SetLinearThresholdTypeToNear_17();
  }

  private native void SetLinearThresholdTypeToBetween_18();
  public void SetLinearThresholdTypeToBetween()
  {
    SetLinearThresholdTypeToBetween_18();
  }

  private native void SetColumnRanges_19(double id0,double id1);
  public void SetColumnRanges(double id0,double id1)
  {
    SetColumnRanges_19(id0,id1);
  }

  private native void SetColumnRanges_20(double id0[]);
  public void SetColumnRanges(double id0[])
  {
    SetColumnRanges_20(id0);
  }

  private native double[] GetColumnRanges_21();
  public double[] GetColumnRanges()
  {
    return GetColumnRanges_21();
  }

  private native void SetDistanceThreshold_22(double id0);
  public void SetDistanceThreshold(double id0)
  {
    SetDistanceThreshold_22(id0);
  }

  private native double GetDistanceThreshold_23();
  public double GetDistanceThreshold()
  {
    return GetDistanceThreshold_23();
  }

  private native void SetUseNormalizedDistance_24(int id0);
  public void SetUseNormalizedDistance(int id0)
  {
    SetUseNormalizedDistance_24(id0);
  }

  private native int GetUseNormalizedDistance_25();
  public int GetUseNormalizedDistance()
  {
    return GetUseNormalizedDistance_25();
  }

  private native void UseNormalizedDistanceOn_26();
  public void UseNormalizedDistanceOn()
  {
    UseNormalizedDistanceOn_26();
  }

  private native void UseNormalizedDistanceOff_27();
  public void UseNormalizedDistanceOff()
  {
    UseNormalizedDistanceOff_27();
  }

  public vtkBivariateLinearTableThreshold() { super(); }

  public vtkBivariateLinearTableThreshold(long id) { super(id); }
  public native long   VTKInit();

}
