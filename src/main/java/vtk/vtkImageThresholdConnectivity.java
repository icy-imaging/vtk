// java wrapper for vtkImageThresholdConnectivity object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageThresholdConnectivity extends vtkImageAlgorithm
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

  private native void SetSeedPoints_4(vtkPoints id0);
  public void SetSeedPoints(vtkPoints id0)
  {
    SetSeedPoints_4(id0);
  }

  private native long GetSeedPoints_5();
  public vtkPoints GetSeedPoints()
  {
    long temp = GetSeedPoints_5();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ThresholdByUpper_6(double id0);
  public void ThresholdByUpper(double id0)
  {
    ThresholdByUpper_6(id0);
  }

  private native void ThresholdByLower_7(double id0);
  public void ThresholdByLower(double id0)
  {
    ThresholdByLower_7(id0);
  }

  private native void ThresholdBetween_8(double id0,double id1);
  public void ThresholdBetween(double id0,double id1)
  {
    ThresholdBetween_8(id0,id1);
  }

  private native void SetReplaceIn_9(int id0);
  public void SetReplaceIn(int id0)
  {
    SetReplaceIn_9(id0);
  }

  private native int GetReplaceIn_10();
  public int GetReplaceIn()
  {
    return GetReplaceIn_10();
  }

  private native void ReplaceInOn_11();
  public void ReplaceInOn()
  {
    ReplaceInOn_11();
  }

  private native void ReplaceInOff_12();
  public void ReplaceInOff()
  {
    ReplaceInOff_12();
  }

  private native void SetInValue_13(double id0);
  public void SetInValue(double id0)
  {
    SetInValue_13(id0);
  }

  private native double GetInValue_14();
  public double GetInValue()
  {
    return GetInValue_14();
  }

  private native void SetReplaceOut_15(int id0);
  public void SetReplaceOut(int id0)
  {
    SetReplaceOut_15(id0);
  }

  private native int GetReplaceOut_16();
  public int GetReplaceOut()
  {
    return GetReplaceOut_16();
  }

  private native void ReplaceOutOn_17();
  public void ReplaceOutOn()
  {
    ReplaceOutOn_17();
  }

  private native void ReplaceOutOff_18();
  public void ReplaceOutOff()
  {
    ReplaceOutOff_18();
  }

  private native void SetOutValue_19(double id0);
  public void SetOutValue(double id0)
  {
    SetOutValue_19(id0);
  }

  private native double GetOutValue_20();
  public double GetOutValue()
  {
    return GetOutValue_20();
  }

  private native double GetUpperThreshold_21();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_21();
  }

  private native double GetLowerThreshold_22();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_22();
  }

  private native void SetSliceRangeX_23(int id0,int id1);
  public void SetSliceRangeX(int id0,int id1)
  {
    SetSliceRangeX_23(id0,id1);
  }

  private native void SetSliceRangeX_24(int id0[]);
  public void SetSliceRangeX(int id0[])
  {
    SetSliceRangeX_24(id0);
  }

  private native int[] GetSliceRangeX_25();
  public int[] GetSliceRangeX()
  {
    return GetSliceRangeX_25();
  }

  private native void SetSliceRangeY_26(int id0,int id1);
  public void SetSliceRangeY(int id0,int id1)
  {
    SetSliceRangeY_26(id0,id1);
  }

  private native void SetSliceRangeY_27(int id0[]);
  public void SetSliceRangeY(int id0[])
  {
    SetSliceRangeY_27(id0);
  }

  private native int[] GetSliceRangeY_28();
  public int[] GetSliceRangeY()
  {
    return GetSliceRangeY_28();
  }

  private native void SetSliceRangeZ_29(int id0,int id1);
  public void SetSliceRangeZ(int id0,int id1)
  {
    SetSliceRangeZ_29(id0,id1);
  }

  private native void SetSliceRangeZ_30(int id0[]);
  public void SetSliceRangeZ(int id0[])
  {
    SetSliceRangeZ_30(id0);
  }

  private native int[] GetSliceRangeZ_31();
  public int[] GetSliceRangeZ()
  {
    return GetSliceRangeZ_31();
  }

  private native void SetStencilData_32(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_32(id0);
  }

  private native long GetStencil_33();
  public vtkImageStencilData GetStencil()
  {
    long temp = GetStencil_33();

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActiveComponent_34(int id0);
  public void SetActiveComponent(int id0)
  {
    SetActiveComponent_34(id0);
  }

  private native int GetActiveComponent_35();
  public int GetActiveComponent()
  {
    return GetActiveComponent_35();
  }

  private native void SetNeighborhoodRadius_36(double id0,double id1,double id2);
  public void SetNeighborhoodRadius(double id0,double id1,double id2)
  {
    SetNeighborhoodRadius_36(id0,id1,id2);
  }

  private native void SetNeighborhoodRadius_37(double id0[]);
  public void SetNeighborhoodRadius(double id0[])
  {
    SetNeighborhoodRadius_37(id0);
  }

  private native double[] GetNeighborhoodRadius_38();
  public double[] GetNeighborhoodRadius()
  {
    return GetNeighborhoodRadius_38();
  }

  private native void SetNeighborhoodFraction_39(double id0);
  public void SetNeighborhoodFraction(double id0)
  {
    SetNeighborhoodFraction_39(id0);
  }

  private native double GetNeighborhoodFractionMinValue_40();
  public double GetNeighborhoodFractionMinValue()
  {
    return GetNeighborhoodFractionMinValue_40();
  }

  private native double GetNeighborhoodFractionMaxValue_41();
  public double GetNeighborhoodFractionMaxValue()
  {
    return GetNeighborhoodFractionMaxValue_41();
  }

  private native double GetNeighborhoodFraction_42();
  public double GetNeighborhoodFraction()
  {
    return GetNeighborhoodFraction_42();
  }

  private native long GetMTime_43();
  public long GetMTime()
  {
    return GetMTime_43();
  }

  private native int GetNumberOfInVoxels_44();
  public int GetNumberOfInVoxels()
  {
    return GetNumberOfInVoxels_44();
  }

  public vtkImageThresholdConnectivity() { super(); }

  public vtkImageThresholdConnectivity(long id) { super(id); }
  public native long   VTKInit();

}
