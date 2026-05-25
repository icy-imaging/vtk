// java wrapper for vtkPiecewiseFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPiecewiseFunction extends vtkDataObject
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

  private native void DeepCopy_4(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_4(id0);
  }

  private native void ShallowCopy_5(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_5(id0);
  }

  private native int GetDataObjectType_6();
  public int GetDataObjectType()
  {
    return GetDataObjectType_6();
  }

  private native int GetSize_7();
  public int GetSize()
  {
    return GetSize_7();
  }

  private native int AddPoint_8(double id0,double id1);
  public int AddPoint(double id0,double id1)
  {
    return AddPoint_8(id0,id1);
  }

  private native int AddPoint_9(double id0,double id1,double id2,double id3);
  public int AddPoint(double id0,double id1,double id2,double id3)
  {
    return AddPoint_9(id0,id1,id2,id3);
  }

  private native int RemovePoint_10(double id0);
  public int RemovePoint(double id0)
  {
    return RemovePoint_10(id0);
  }

  private native int RemovePoint_11(double id0,double id1);
  public int RemovePoint(double id0,double id1)
  {
    return RemovePoint_11(id0,id1);
  }

  private native void RemoveAllPoints_12();
  public void RemoveAllPoints()
  {
    RemoveAllPoints_12();
  }

  private native void AddSegment_13(double id0,double id1,double id2,double id3);
  public void AddSegment(double id0,double id1,double id2,double id3)
  {
    AddSegment_13(id0,id1,id2,id3);
  }

  private native double GetValue_14(double id0);
  public double GetValue(double id0)
  {
    return GetValue_14(id0);
  }

  private native int GetNodeValue_15(int id0,double id1[]);
  public int GetNodeValue(int id0,double id1[])
  {
    return GetNodeValue_15(id0,id1);
  }

  private native int SetNodeValue_16(int id0,double id1[]);
  public int SetNodeValue(int id0,double id1[])
  {
    return SetNodeValue_16(id0,id1);
  }

  private native double[] GetRange_17();
  public double[] GetRange()
  {
    return GetRange_17();
  }

  private native int AdjustRange_18(double id0[]);
  public int AdjustRange(double id0[])
  {
    return AdjustRange_18(id0);
  }

  private native void SetClamping_19(int id0);
  public void SetClamping(int id0)
  {
    SetClamping_19(id0);
  }

  private native int GetClamping_20();
  public int GetClamping()
  {
    return GetClamping_20();
  }

  private native void ClampingOn_21();
  public void ClampingOn()
  {
    ClampingOn_21();
  }

  private native void ClampingOff_22();
  public void ClampingOff()
  {
    ClampingOff_22();
  }

  private native void SetUseLogScale_23(boolean id0);
  public void SetUseLogScale(boolean id0)
  {
    SetUseLogScale_23(id0);
  }

  private native boolean GetUseLogScale_24();
  public boolean GetUseLogScale()
  {
    return GetUseLogScale_24();
  }

  private native void UseLogScaleOn_25();
  public void UseLogScaleOn()
  {
    UseLogScaleOn_25();
  }

  private native void UseLogScaleOff_26();
  public void UseLogScaleOff()
  {
    UseLogScaleOff_26();
  }

  private native byte[] GetType_27();
  public String GetType()
  {
    return new String(GetType_27(), StandardCharsets.UTF_8);
  }

  private native double GetFirstNonZeroValue_28();
  public double GetFirstNonZeroValue()
  {
    return GetFirstNonZeroValue_28();
  }

  private native void Initialize_29();
  public void Initialize()
  {
    Initialize_29();
  }

  private native long GetData_30(vtkInformation id0);
  public vtkPiecewiseFunction GetData(vtkInformation id0)
  {
    long temp = GetData_30(id0);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_31(vtkInformationVector id0,int id1);
  public vtkPiecewiseFunction GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_31(id0,id1);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAllowDuplicateScalars_32(int id0);
  public void SetAllowDuplicateScalars(int id0)
  {
    SetAllowDuplicateScalars_32(id0);
  }

  private native int GetAllowDuplicateScalars_33();
  public int GetAllowDuplicateScalars()
  {
    return GetAllowDuplicateScalars_33();
  }

  private native void AllowDuplicateScalarsOn_34();
  public void AllowDuplicateScalarsOn()
  {
    AllowDuplicateScalarsOn_34();
  }

  private native void AllowDuplicateScalarsOff_35();
  public void AllowDuplicateScalarsOff()
  {
    AllowDuplicateScalarsOff_35();
  }

  private native void UpdateSearchMethod_36(double id0,double id1);
  public void UpdateSearchMethod(double id0,double id1)
  {
    UpdateSearchMethod_36(id0,id1);
  }

  private native int GetAutomaticSearchMethod_37();
  public int GetAutomaticSearchMethod()
  {
    return GetAutomaticSearchMethod_37();
  }

  private native void SetUseCustomSearchMethod_38(boolean id0);
  public void SetUseCustomSearchMethod(boolean id0)
  {
    SetUseCustomSearchMethod_38(id0);
  }

  private native void SetCustomSearchMethod_39(int id0);
  public void SetCustomSearchMethod(int id0)
  {
    SetCustomSearchMethod_39(id0);
  }

  private native int GetCustomSearchMethod_40();
  public int GetCustomSearchMethod()
  {
    return GetCustomSearchMethod_40();
  }

  public vtkPiecewiseFunction() { super(); }

  public vtkPiecewiseFunction(long id) { super(id); }
  public native long   VTKInit();

}
