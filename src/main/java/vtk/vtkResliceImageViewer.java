// java wrapper for vtkResliceImageViewer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceImageViewer extends vtkImageViewer2
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

  private native void Render_4();
  public void Render()
  {
    Render_4();
  }

  private native void SetInputData_5(vtkImageData id0);
  public void SetInputData(vtkImageData id0)
  {
    SetInputData_5(id0);
  }

  private native void SetInputConnection_6(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_6(id0);
  }

  private native void SetColorWindow_7(double id0);
  public void SetColorWindow(double id0)
  {
    SetColorWindow_7(id0);
  }

  private native void SetColorLevel_8(double id0);
  public void SetColorLevel(double id0)
  {
    SetColorLevel_8(id0);
  }

  private native long GetResliceCursorWidget_9();
  public vtkResliceCursorWidget GetResliceCursorWidget()
  {
    long temp = GetResliceCursorWidget_9();

    if (temp == 0) return null;
    return (vtkResliceCursorWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetResliceMode_10();
  public int GetResliceMode()
  {
    return GetResliceMode_10();
  }

  private native void SetResliceMode_11(int id0);
  public void SetResliceMode(int id0)
  {
    SetResliceMode_11(id0);
  }

  private native void SetResliceModeToAxisAligned_12();
  public void SetResliceModeToAxisAligned()
  {
    SetResliceModeToAxisAligned_12();
  }

  private native void SetResliceModeToOblique_13();
  public void SetResliceModeToOblique()
  {
    SetResliceModeToOblique_13();
  }

  private native long GetResliceCursor_14();
  public vtkResliceCursor GetResliceCursor()
  {
    long temp = GetResliceCursor_14();

    if (temp == 0) return null;
    return (vtkResliceCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetResliceCursor_15(vtkResliceCursor id0);
  public void SetResliceCursor(vtkResliceCursor id0)
  {
    SetResliceCursor_15(id0);
  }

  private native void SetLookupTable_16(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_16(id0);
  }

  private native long GetLookupTable_17();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_17();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetThickMode_18(int id0);
  public void SetThickMode(int id0)
  {
    SetThickMode_18(id0);
  }

  private native int GetThickMode_19();
  public int GetThickMode()
  {
    return GetThickMode_19();
  }

  private native void Reset_20();
  public void Reset()
  {
    Reset_20();
  }

  private native long GetPointPlacer_21();
  public vtkBoundedPlanePointPlacer GetPointPlacer()
  {
    long temp = GetPointPlacer_21();

    if (temp == 0) return null;
    return (vtkBoundedPlanePointPlacer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMeasurements_22();
  public vtkResliceImageViewerMeasurements GetMeasurements()
  {
    long temp = GetMeasurements_22();

    if (temp == 0) return null;
    return (vtkResliceImageViewerMeasurements)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInteractor_23();
  public vtkRenderWindowInteractor GetInteractor()
  {
    long temp = GetInteractor_23();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSliceScrollOnMouseWheel_24(int id0);
  public void SetSliceScrollOnMouseWheel(int id0)
  {
    SetSliceScrollOnMouseWheel_24(id0);
  }

  private native int GetSliceScrollOnMouseWheel_25();
  public int GetSliceScrollOnMouseWheel()
  {
    return GetSliceScrollOnMouseWheel_25();
  }

  private native void SliceScrollOnMouseWheelOn_26();
  public void SliceScrollOnMouseWheelOn()
  {
    SliceScrollOnMouseWheelOn_26();
  }

  private native void SliceScrollOnMouseWheelOff_27();
  public void SliceScrollOnMouseWheelOff()
  {
    SliceScrollOnMouseWheelOff_27();
  }

  private native void SetSliceScrollFactor_28(double id0);
  public void SetSliceScrollFactor(double id0)
  {
    SetSliceScrollFactor_28(id0);
  }

  private native double GetSliceScrollFactor_29();
  public double GetSliceScrollFactor()
  {
    return GetSliceScrollFactor_29();
  }

  private native void IncrementSlice_30(int id0);
  public void IncrementSlice(int id0)
  {
    IncrementSlice_30(id0);
  }

  public vtkResliceImageViewer() { super(); }

  public vtkResliceImageViewer(long id) { super(id); }
  public native long   VTKInit();

}
