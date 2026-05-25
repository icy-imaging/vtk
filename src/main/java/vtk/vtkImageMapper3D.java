// java wrapper for vtkImageMapper3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMapper3D extends vtkAbstractMapper3D
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

  private native void Render_4(vtkRenderer id0,vtkImageSlice id1);
  public void Render(vtkRenderer id0,vtkImageSlice id1)
  {
    Render_4(id0,id1);
  }

  private native void ReleaseGraphicsResources_5(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_5(id0);
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

  private native long GetDataSetInput_8();
  public vtkDataSet GetDataSetInput()
  {
    long temp = GetDataSetInput_8();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataObjectInput_9();
  public vtkDataObject GetDataObjectInput()
  {
    long temp = GetDataObjectInput_9();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBorder_10(int id0);
  public void SetBorder(int id0)
  {
    SetBorder_10(id0);
  }

  private native void BorderOn_11();
  public void BorderOn()
  {
    BorderOn_11();
  }

  private native void BorderOff_12();
  public void BorderOff()
  {
    BorderOff_12();
  }

  private native int GetBorder_13();
  public int GetBorder()
  {
    return GetBorder_13();
  }

  private native void SetBackground_14(int id0);
  public void SetBackground(int id0)
  {
    SetBackground_14(id0);
  }

  private native void BackgroundOn_15();
  public void BackgroundOn()
  {
    BackgroundOn_15();
  }

  private native void BackgroundOff_16();
  public void BackgroundOff()
  {
    BackgroundOff_16();
  }

  private native int GetBackground_17();
  public int GetBackground()
  {
    return GetBackground_17();
  }

  private native void SetSliceAtFocalPoint_18(int id0);
  public void SetSliceAtFocalPoint(int id0)
  {
    SetSliceAtFocalPoint_18(id0);
  }

  private native void SliceAtFocalPointOn_19();
  public void SliceAtFocalPointOn()
  {
    SliceAtFocalPointOn_19();
  }

  private native void SliceAtFocalPointOff_20();
  public void SliceAtFocalPointOff()
  {
    SliceAtFocalPointOff_20();
  }

  private native int GetSliceAtFocalPoint_21();
  public int GetSliceAtFocalPoint()
  {
    return GetSliceAtFocalPoint_21();
  }

  private native void SetSliceFacesCamera_22(int id0);
  public void SetSliceFacesCamera(int id0)
  {
    SetSliceFacesCamera_22(id0);
  }

  private native void SliceFacesCameraOn_23();
  public void SliceFacesCameraOn()
  {
    SliceFacesCameraOn_23();
  }

  private native void SliceFacesCameraOff_24();
  public void SliceFacesCameraOff()
  {
    SliceFacesCameraOff_24();
  }

  private native int GetSliceFacesCamera_25();
  public int GetSliceFacesCamera()
  {
    return GetSliceFacesCamera_25();
  }

  private native long GetSlicePlane_26();
  public vtkPlane GetSlicePlane()
  {
    long temp = GetSlicePlane_26();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetSlicePlaneInDataCoords_27(vtkMatrix4x4 id0,double id1[]);
  public void GetSlicePlaneInDataCoords(vtkMatrix4x4 id0,double id1[])
  {
    GetSlicePlaneInDataCoords_27(id0,id1);
  }

  private native void SetNumberOfThreads_28(int id0);
  public void SetNumberOfThreads(int id0)
  {
    SetNumberOfThreads_28(id0);
  }

  private native int GetNumberOfThreadsMinValue_29();
  public int GetNumberOfThreadsMinValue()
  {
    return GetNumberOfThreadsMinValue_29();
  }

  private native int GetNumberOfThreadsMaxValue_30();
  public int GetNumberOfThreadsMaxValue()
  {
    return GetNumberOfThreadsMaxValue_30();
  }

  private native int GetNumberOfThreads_31();
  public int GetNumberOfThreads()
  {
    return GetNumberOfThreads_31();
  }

  private native void SetStreaming_32(int id0);
  public void SetStreaming(int id0)
  {
    SetStreaming_32(id0);
  }

  private native int GetStreaming_33();
  public int GetStreaming()
  {
    return GetStreaming_33();
  }

  private native void StreamingOn_34();
  public void StreamingOn()
  {
    StreamingOn_34();
  }

  private native void StreamingOff_35();
  public void StreamingOff()
  {
    StreamingOff_35();
  }

  private native void GetIndexBounds_36(double id0[]);
  public void GetIndexBounds(double id0[])
  {
    GetIndexBounds_36(id0);
  }

  public vtkImageMapper3D() { super(); }

  public vtkImageMapper3D(long id) { super(id); }

}
