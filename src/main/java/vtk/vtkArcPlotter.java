// java wrapper for vtkArcPlotter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArcPlotter extends vtkPolyDataAlgorithm
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

  private native void SetCamera_4(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_4(id0);
  }

  private native long GetCamera_5();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_5();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPlotMode_6(int id0);
  public void SetPlotMode(int id0)
  {
    SetPlotMode_6(id0);
  }

  private native int GetPlotMode_7();
  public int GetPlotMode()
  {
    return GetPlotMode_7();
  }

  private native void SetPlotModeToPlotScalars_8();
  public void SetPlotModeToPlotScalars()
  {
    SetPlotModeToPlotScalars_8();
  }

  private native void SetPlotModeToPlotVectors_9();
  public void SetPlotModeToPlotVectors()
  {
    SetPlotModeToPlotVectors_9();
  }

  private native void SetPlotModeToPlotNormals_10();
  public void SetPlotModeToPlotNormals()
  {
    SetPlotModeToPlotNormals_10();
  }

  private native void SetPlotModeToPlotTCoords_11();
  public void SetPlotModeToPlotTCoords()
  {
    SetPlotModeToPlotTCoords_11();
  }

  private native void SetPlotModeToPlotTensors_12();
  public void SetPlotModeToPlotTensors()
  {
    SetPlotModeToPlotTensors_12();
  }

  private native void SetPlotModeToPlotFieldData_13();
  public void SetPlotModeToPlotFieldData()
  {
    SetPlotModeToPlotFieldData_13();
  }

  private native void SetPlotComponent_14(int id0);
  public void SetPlotComponent(int id0)
  {
    SetPlotComponent_14(id0);
  }

  private native int GetPlotComponent_15();
  public int GetPlotComponent()
  {
    return GetPlotComponent_15();
  }

  private native void SetRadius_16(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_16(id0);
  }

  private native double GetRadiusMinValue_17();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_17();
  }

  private native double GetRadiusMaxValue_18();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_18();
  }

  private native double GetRadius_19();
  public double GetRadius()
  {
    return GetRadius_19();
  }

  private native void SetHeight_20(double id0);
  public void SetHeight(double id0)
  {
    SetHeight_20(id0);
  }

  private native double GetHeightMinValue_21();
  public double GetHeightMinValue()
  {
    return GetHeightMinValue_21();
  }

  private native double GetHeightMaxValue_22();
  public double GetHeightMaxValue()
  {
    return GetHeightMaxValue_22();
  }

  private native double GetHeight_23();
  public double GetHeight()
  {
    return GetHeight_23();
  }

  private native void SetOffset_24(double id0);
  public void SetOffset(double id0)
  {
    SetOffset_24(id0);
  }

  private native double GetOffsetMinValue_25();
  public double GetOffsetMinValue()
  {
    return GetOffsetMinValue_25();
  }

  private native double GetOffsetMaxValue_26();
  public double GetOffsetMaxValue()
  {
    return GetOffsetMaxValue_26();
  }

  private native double GetOffset_27();
  public double GetOffset()
  {
    return GetOffset_27();
  }

  private native void SetUseDefaultNormal_28(int id0);
  public void SetUseDefaultNormal(int id0)
  {
    SetUseDefaultNormal_28(id0);
  }

  private native int GetUseDefaultNormal_29();
  public int GetUseDefaultNormal()
  {
    return GetUseDefaultNormal_29();
  }

  private native void UseDefaultNormalOn_30();
  public void UseDefaultNormalOn()
  {
    UseDefaultNormalOn_30();
  }

  private native void UseDefaultNormalOff_31();
  public void UseDefaultNormalOff()
  {
    UseDefaultNormalOff_31();
  }

  private native void SetDefaultNormal_32(float id0,float id1,float id2);
  public void SetDefaultNormal(float id0,float id1,float id2)
  {
    SetDefaultNormal_32(id0,id1,id2);
  }

  private native void SetDefaultNormal_33(float id0[]);
  public void SetDefaultNormal(float id0[])
  {
    SetDefaultNormal_33(id0);
  }

  private native float[] GetDefaultNormal_34();
  public float[] GetDefaultNormal()
  {
    return GetDefaultNormal_34();
  }

  private native void SetFieldDataArray_35(int id0);
  public void SetFieldDataArray(int id0)
  {
    SetFieldDataArray_35(id0);
  }

  private native int GetFieldDataArrayMinValue_36();
  public int GetFieldDataArrayMinValue()
  {
    return GetFieldDataArrayMinValue_36();
  }

  private native int GetFieldDataArrayMaxValue_37();
  public int GetFieldDataArrayMaxValue()
  {
    return GetFieldDataArrayMaxValue_37();
  }

  private native int GetFieldDataArray_38();
  public int GetFieldDataArray()
  {
    return GetFieldDataArray_38();
  }

  private native long GetMTime_39();
  public long GetMTime()
  {
    return GetMTime_39();
  }

  public vtkArcPlotter() { super(); }

  public vtkArcPlotter(long id) { super(id); }
  public native long   VTKInit();

}
