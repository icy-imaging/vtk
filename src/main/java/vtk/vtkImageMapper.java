// java wrapper for vtkImageMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMapper extends vtkMapper2D
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetColorWindow_5(double id0);
  public void SetColorWindow(double id0)
  {
    SetColorWindow_5(id0);
  }

  private native double GetColorWindow_6();
  public double GetColorWindow()
  {
    return GetColorWindow_6();
  }

  private native void SetColorLevel_7(double id0);
  public void SetColorLevel(double id0)
  {
    SetColorLevel_7(id0);
  }

  private native double GetColorLevel_8();
  public double GetColorLevel()
  {
    return GetColorLevel_8();
  }

  private native void SetZSlice_9(int id0);
  public void SetZSlice(int id0)
  {
    SetZSlice_9(id0);
  }

  private native int GetZSlice_10();
  public int GetZSlice()
  {
    return GetZSlice_10();
  }

  private native int GetWholeZMin_11();
  public int GetWholeZMin()
  {
    return GetWholeZMin_11();
  }

  private native int GetWholeZMax_12();
  public int GetWholeZMax()
  {
    return GetWholeZMax_12();
  }

  private native void RenderStart_13(vtkViewport id0,vtkActor2D id1);
  public void RenderStart(vtkViewport id0,vtkActor2D id1)
  {
    RenderStart_13(id0,id1);
  }

  private native void RenderData_14(vtkViewport id0,vtkImageData id1,vtkActor2D id2);
  public void RenderData(vtkViewport id0,vtkImageData id1,vtkActor2D id2)
  {
    RenderData_14(id0,id1,id2);
  }

  private native double GetColorShift_15();
  public double GetColorShift()
  {
    return GetColorShift_15();
  }

  private native double GetColorScale_16();
  public double GetColorScale()
  {
    return GetColorScale_16();
  }

  private native void SetInputData_17(vtkImageData id0);
  public void SetInputData(vtkImageData id0)
  {
    SetInputData_17(id0);
  }

  private native long GetInput_18();
  public vtkImageData GetInput()
  {
    long temp = GetInput_18();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderToRectangle_19(int id0);
  public void SetRenderToRectangle(int id0)
  {
    SetRenderToRectangle_19(id0);
  }

  private native int GetRenderToRectangle_20();
  public int GetRenderToRectangle()
  {
    return GetRenderToRectangle_20();
  }

  private native void RenderToRectangleOn_21();
  public void RenderToRectangleOn()
  {
    RenderToRectangleOn_21();
  }

  private native void RenderToRectangleOff_22();
  public void RenderToRectangleOff()
  {
    RenderToRectangleOff_22();
  }

  private native void SetUseCustomExtents_23(int id0);
  public void SetUseCustomExtents(int id0)
  {
    SetUseCustomExtents_23(id0);
  }

  private native int GetUseCustomExtents_24();
  public int GetUseCustomExtents()
  {
    return GetUseCustomExtents_24();
  }

  private native void UseCustomExtentsOn_25();
  public void UseCustomExtentsOn()
  {
    UseCustomExtentsOn_25();
  }

  private native void UseCustomExtentsOff_26();
  public void UseCustomExtentsOff()
  {
    UseCustomExtentsOff_26();
  }

  private native int[] GetCustomDisplayExtents_27();
  public int[] GetCustomDisplayExtents()
  {
    return GetCustomDisplayExtents_27();
  }

  public vtkImageMapper() { super(); }

  public vtkImageMapper(long id) { super(id); }
  public native long   VTKInit();

}
