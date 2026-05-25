// java wrapper for vtkDepthSortPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDepthSortPolyData extends vtkPolyDataAlgorithm
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

  private native void SetDirection_4(int id0);
  public void SetDirection(int id0)
  {
    SetDirection_4(id0);
  }

  private native int GetDirection_5();
  public int GetDirection()
  {
    return GetDirection_5();
  }

  private native void SetDirectionToFrontToBack_6();
  public void SetDirectionToFrontToBack()
  {
    SetDirectionToFrontToBack_6();
  }

  private native void SetDirectionToBackToFront_7();
  public void SetDirectionToBackToFront()
  {
    SetDirectionToBackToFront_7();
  }

  private native void SetDirectionToSpecifiedVector_8();
  public void SetDirectionToSpecifiedVector()
  {
    SetDirectionToSpecifiedVector_8();
  }

  private native void SetDepthSortMode_9(int id0);
  public void SetDepthSortMode(int id0)
  {
    SetDepthSortMode_9(id0);
  }

  private native int GetDepthSortMode_10();
  public int GetDepthSortMode()
  {
    return GetDepthSortMode_10();
  }

  private native void SetDepthSortModeToFirstPoint_11();
  public void SetDepthSortModeToFirstPoint()
  {
    SetDepthSortModeToFirstPoint_11();
  }

  private native void SetDepthSortModeToBoundsCenter_12();
  public void SetDepthSortModeToBoundsCenter()
  {
    SetDepthSortModeToBoundsCenter_12();
  }

  private native void SetDepthSortModeToParametricCenter_13();
  public void SetDepthSortModeToParametricCenter()
  {
    SetDepthSortModeToParametricCenter_13();
  }

  private native void SetCamera_14(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_14(id0);
  }

  private native long GetCamera_15();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_15();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProp3D_16(vtkProp3D id0);
  public void SetProp3D(vtkProp3D id0)
  {
    SetProp3D_16(id0);
  }

  private native long GetProp3D_17();
  public vtkProp3D GetProp3D()
  {
    long temp = GetProp3D_17();

    if (temp == 0) return null;
    return (vtkProp3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVector_18(double id0,double id1,double id2);
  public void SetVector(double id0,double id1,double id2)
  {
    SetVector_18(id0,id1,id2);
  }

  private native void SetVector_19(double id0[]);
  public void SetVector(double id0[])
  {
    SetVector_19(id0);
  }

  private native double[] GetVector_20();
  public double[] GetVector()
  {
    return GetVector_20();
  }

  private native void SetOrigin_21(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_21(id0,id1,id2);
  }

  private native void SetOrigin_22(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_22(id0);
  }

  private native double[] GetOrigin_23();
  public double[] GetOrigin()
  {
    return GetOrigin_23();
  }

  private native void SetSortScalars_24(int id0);
  public void SetSortScalars(int id0)
  {
    SetSortScalars_24(id0);
  }

  private native int GetSortScalars_25();
  public int GetSortScalars()
  {
    return GetSortScalars_25();
  }

  private native void SortScalarsOn_26();
  public void SortScalarsOn()
  {
    SortScalarsOn_26();
  }

  private native void SortScalarsOff_27();
  public void SortScalarsOff()
  {
    SortScalarsOff_27();
  }

  private native long GetMTime_28();
  public long GetMTime()
  {
    return GetMTime_28();
  }

  public vtkDepthSortPolyData() { super(); }

  public vtkDepthSortPolyData(long id) { super(id); }
  public native long   VTKInit();

}
