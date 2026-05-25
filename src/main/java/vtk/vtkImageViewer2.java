// java wrapper for vtkImageViewer2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageViewer2 extends vtkObject
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

  private native byte[] GetWindowName_4();
  public String GetWindowName()
  {
    return new String(GetWindowName_4(), StandardCharsets.UTF_8);
  }

  private native void Render_5();
  public void Render()
  {
    Render_5();
  }

  private native void SetInputData_6(vtkImageData id0);
  public void SetInputData(vtkImageData id0)
  {
    SetInputData_6(id0);
  }

  private native long GetInput_7();
  public vtkImageData GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputConnection_8(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_8(id0);
  }

  private native int GetSliceOrientation_9();
  public int GetSliceOrientation()
  {
    return GetSliceOrientation_9();
  }

  private native void SetSliceOrientation_10(int id0);
  public void SetSliceOrientation(int id0)
  {
    SetSliceOrientation_10(id0);
  }

  private native void SetSliceOrientationToXY_11();
  public void SetSliceOrientationToXY()
  {
    SetSliceOrientationToXY_11();
  }

  private native void SetSliceOrientationToYZ_12();
  public void SetSliceOrientationToYZ()
  {
    SetSliceOrientationToYZ_12();
  }

  private native void SetSliceOrientationToXZ_13();
  public void SetSliceOrientationToXZ()
  {
    SetSliceOrientationToXZ_13();
  }

  private native int GetSlice_14();
  public int GetSlice()
  {
    return GetSlice_14();
  }

  private native void SetSlice_15(int id0);
  public void SetSlice(int id0)
  {
    SetSlice_15(id0);
  }

  private native void UpdateDisplayExtent_16();
  public void UpdateDisplayExtent()
  {
    UpdateDisplayExtent_16();
  }

  private native int GetSliceMin_17();
  public int GetSliceMin()
  {
    return GetSliceMin_17();
  }

  private native int GetSliceMax_18();
  public int GetSliceMax()
  {
    return GetSliceMax_18();
  }

  private native void GetSliceRange_19(int id0[]);
  public void GetSliceRange(int id0[])
  {
    GetSliceRange_19(id0);
  }

  private native double GetColorWindow_20();
  public double GetColorWindow()
  {
    return GetColorWindow_20();
  }

  private native double GetColorLevel_21();
  public double GetColorLevel()
  {
    return GetColorLevel_21();
  }

  private native void SetColorWindow_22(double id0);
  public void SetColorWindow(double id0)
  {
    SetColorWindow_22(id0);
  }

  private native void SetColorLevel_23(double id0);
  public void SetColorLevel(double id0)
  {
    SetColorLevel_23(id0);
  }

  private native int[] GetPosition_24();
  public int[] GetPosition()
  {
    return GetPosition_24();
  }

  private native void SetPosition_25(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_25(id0,id1);
  }

  private native void SetPosition_26(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_26(id0);
  }

  private native int[] GetSize_27();
  public int[] GetSize()
  {
    return GetSize_27();
  }

  private native void SetSize_28(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_28(id0,id1);
  }

  private native void SetSize_29(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_29(id0);
  }

  private native long GetRenderWindow_30();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_30();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRenderer_31();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_31();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImageActor_32();
  public vtkImageActor GetImageActor()
  {
    long temp = GetImageActor_32();

    if (temp == 0) return null;
    return (vtkImageActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetWindowLevel_33();
  public vtkImageMapToWindowLevelColors GetWindowLevel()
  {
    long temp = GetWindowLevel_33();

    if (temp == 0) return null;
    return (vtkImageMapToWindowLevelColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInteractorStyle_34();
  public vtkInteractorStyleImage GetInteractorStyle()
  {
    long temp = GetInteractorStyle_34();

    if (temp == 0) return null;
    return (vtkInteractorStyleImage)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderWindow_35(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_35(id0);
  }

  private native void SetRenderer_36(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_36(id0);
  }

  private native void SetupInteractor_37(vtkRenderWindowInteractor id0);
  public void SetupInteractor(vtkRenderWindowInteractor id0)
  {
    SetupInteractor_37(id0);
  }

  private native void SetOffScreenRendering_38(int id0);
  public void SetOffScreenRendering(int id0)
  {
    SetOffScreenRendering_38(id0);
  }

  private native int GetOffScreenRendering_39();
  public int GetOffScreenRendering()
  {
    return GetOffScreenRendering_39();
  }

  private native void OffScreenRenderingOn_40();
  public void OffScreenRenderingOn()
  {
    OffScreenRenderingOn_40();
  }

  private native void OffScreenRenderingOff_41();
  public void OffScreenRenderingOff()
  {
    OffScreenRenderingOff_41();
  }

  public vtkImageViewer2() { super(); }

  public vtkImageViewer2(long id) { super(id); }
  public native long   VTKInit();

}
