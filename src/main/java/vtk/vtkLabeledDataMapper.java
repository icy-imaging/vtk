// java wrapper for vtkLabeledDataMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabeledDataMapper extends vtkMapper2D
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

  private native void SetLabelFormat_4(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_4(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_5();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_5(), StandardCharsets.UTF_8);
  }

  private native void SetLabeledComponent_6(int id0);
  public void SetLabeledComponent(int id0)
  {
    SetLabeledComponent_6(id0);
  }

  private native int GetLabeledComponent_7();
  public int GetLabeledComponent()
  {
    return GetLabeledComponent_7();
  }

  private native void SetComponentSeparator_8(char id0);
  public void SetComponentSeparator(char id0)
  {
    SetComponentSeparator_8(id0);
  }

  private native char GetComponentSeparator_9();
  public char GetComponentSeparator()
  {
    return GetComponentSeparator_9();
  }

  private native void SetFieldDataArray_10(int id0);
  public void SetFieldDataArray(int id0)
  {
    SetFieldDataArray_10(id0);
  }

  private native int GetFieldDataArray_11();
  public int GetFieldDataArray()
  {
    return GetFieldDataArray_11();
  }

  private native void SetFieldDataName_12(byte[] id0, int len0);
  public void SetFieldDataName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldDataName_12(bytes0, bytes0.length);
  }

  private native byte[] GetFieldDataName_13();
  public String GetFieldDataName()
  {
    return new String(GetFieldDataName_13(), StandardCharsets.UTF_8);
  }

  private native void SetInputData_14(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_14(id0);
  }

  private native long GetInput_15();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_15();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelMode_16(int id0);
  public void SetLabelMode(int id0)
  {
    SetLabelMode_16(id0);
  }

  private native int GetLabelMode_17();
  public int GetLabelMode()
  {
    return GetLabelMode_17();
  }

  private native void SetLabelModeToLabelIds_18();
  public void SetLabelModeToLabelIds()
  {
    SetLabelModeToLabelIds_18();
  }

  private native void SetLabelModeToLabelScalars_19();
  public void SetLabelModeToLabelScalars()
  {
    SetLabelModeToLabelScalars_19();
  }

  private native void SetLabelModeToLabelVectors_20();
  public void SetLabelModeToLabelVectors()
  {
    SetLabelModeToLabelVectors_20();
  }

  private native void SetLabelModeToLabelNormals_21();
  public void SetLabelModeToLabelNormals()
  {
    SetLabelModeToLabelNormals_21();
  }

  private native void SetLabelModeToLabelTCoords_22();
  public void SetLabelModeToLabelTCoords()
  {
    SetLabelModeToLabelTCoords_22();
  }

  private native void SetLabelModeToLabelTensors_23();
  public void SetLabelModeToLabelTensors()
  {
    SetLabelModeToLabelTensors_23();
  }

  private native void SetLabelModeToLabelFieldData_24();
  public void SetLabelModeToLabelFieldData()
  {
    SetLabelModeToLabelFieldData_24();
  }

  private native void SetLabelTextProperty_25(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_25(id0);
  }

  private native long GetLabelTextProperty_26();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_26();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelTextProperty_27(vtkTextProperty id0,int id1);
  public void SetLabelTextProperty(vtkTextProperty id0,int id1)
  {
    SetLabelTextProperty_27(id0,id1);
  }

  private native long GetLabelTextProperty_28(int id0);
  public vtkTextProperty GetLabelTextProperty(int id0)
  {
    long temp = GetLabelTextProperty_28(id0);

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RenderOpaqueGeometry_29(vtkViewport id0,vtkActor2D id1);
  public void RenderOpaqueGeometry(vtkViewport id0,vtkActor2D id1)
  {
    RenderOpaqueGeometry_29(id0,id1);
  }

  private native void RenderOverlay_30(vtkViewport id0,vtkActor2D id1);
  public void RenderOverlay(vtkViewport id0,vtkActor2D id1)
  {
    RenderOverlay_30(id0,id1);
  }

  private native void ReleaseGraphicsResources_31(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_31(id0);
  }

  private native long GetTransform_32();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_32();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransform_33(vtkTransform id0);
  public void SetTransform(vtkTransform id0)
  {
    SetTransform_33(id0);
  }

  private native int GetCoordinateSystem_34();
  public int GetCoordinateSystem()
  {
    return GetCoordinateSystem_34();
  }

  private native void SetCoordinateSystem_35(int id0);
  public void SetCoordinateSystem(int id0)
  {
    SetCoordinateSystem_35(id0);
  }

  private native int GetCoordinateSystemMinValue_36();
  public int GetCoordinateSystemMinValue()
  {
    return GetCoordinateSystemMinValue_36();
  }

  private native int GetCoordinateSystemMaxValue_37();
  public int GetCoordinateSystemMaxValue()
  {
    return GetCoordinateSystemMaxValue_37();
  }

  private native void CoordinateSystemWorld_38();
  public void CoordinateSystemWorld()
  {
    CoordinateSystemWorld_38();
  }

  private native void CoordinateSystemDisplay_39();
  public void CoordinateSystemDisplay()
  {
    CoordinateSystemDisplay_39();
  }

  private native long GetMTime_40();
  public long GetMTime()
  {
    return GetMTime_40();
  }

  private native int GetNumberOfLabels_41();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_41();
  }

  private native void GetLabelPosition_42(int id0,double id1[]);
  public void GetLabelPosition(int id0,double id1[])
  {
    GetLabelPosition_42(id0,id1);
  }

  private native byte[] GetLabelText_43(int id0);
  public String GetLabelText(int id0)
  {
    return new String(GetLabelText_43(id0), StandardCharsets.UTF_8);
  }

  public vtkLabeledDataMapper() { super(); }

  public vtkLabeledDataMapper(long id) { super(id); }
  public native long   VTKInit();

}
