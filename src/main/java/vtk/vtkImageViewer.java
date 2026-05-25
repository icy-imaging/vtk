// java wrapper for vtkImageViewer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageViewer extends vtkObject
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

  private native int GetWholeZMin_9();
  public int GetWholeZMin()
  {
    return GetWholeZMin_9();
  }

  private native int GetWholeZMax_10();
  public int GetWholeZMax()
  {
    return GetWholeZMax_10();
  }

  private native int GetZSlice_11();
  public int GetZSlice()
  {
    return GetZSlice_11();
  }

  private native void SetZSlice_12(int id0);
  public void SetZSlice(int id0)
  {
    SetZSlice_12(id0);
  }

  private native double GetColorWindow_13();
  public double GetColorWindow()
  {
    return GetColorWindow_13();
  }

  private native double GetColorLevel_14();
  public double GetColorLevel()
  {
    return GetColorLevel_14();
  }

  private native void SetColorWindow_15(double id0);
  public void SetColorWindow(double id0)
  {
    SetColorWindow_15(id0);
  }

  private native void SetColorLevel_16(double id0);
  public void SetColorLevel(double id0)
  {
    SetColorLevel_16(id0);
  }

  private native int[] GetPosition_17();
  public int[] GetPosition()
  {
    return GetPosition_17();
  }

  private native void SetPosition_18(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_18(id0,id1);
  }

  private native void SetPosition_19(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_19(id0);
  }

  private native int[] GetSize_20();
  public int[] GetSize()
  {
    return GetSize_20();
  }

  private native void SetSize_21(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_21(id0,id1);
  }

  private native void SetSize_22(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_22(id0);
  }

  private native long GetRenderWindow_23();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_23();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderWindow_24(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_24(id0);
  }

  private native long GetRenderer_25();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_25();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImageMapper_26();
  public vtkImageMapper GetImageMapper()
  {
    long temp = GetImageMapper_26();

    if (temp == 0) return null;
    return (vtkImageMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActor2D_27();
  public vtkActor2D GetActor2D()
  {
    long temp = GetActor2D_27();

    if (temp == 0) return null;
    return (vtkActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetupInteractor_28(vtkRenderWindowInteractor id0);
  public void SetupInteractor(vtkRenderWindowInteractor id0)
  {
    SetupInteractor_28(id0);
  }

  private native void SetOffScreenRendering_29(int id0);
  public void SetOffScreenRendering(int id0)
  {
    SetOffScreenRendering_29(id0);
  }

  private native int GetOffScreenRendering_30();
  public int GetOffScreenRendering()
  {
    return GetOffScreenRendering_30();
  }

  private native void OffScreenRenderingOn_31();
  public void OffScreenRenderingOn()
  {
    OffScreenRenderingOn_31();
  }

  private native void OffScreenRenderingOff_32();
  public void OffScreenRenderingOff()
  {
    OffScreenRenderingOff_32();
  }

  public vtkImageViewer() { super(); }

  public vtkImageViewer(long id) { super(id); }
  public native long   VTKInit();

}
