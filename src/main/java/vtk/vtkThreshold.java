// java wrapper for vtkThreshold object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkThreshold extends vtkUnstructuredGridAlgorithm
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

  private native void SetThresholdFunction_4(int id0);
  public void SetThresholdFunction(int id0)
  {
    SetThresholdFunction_4(id0);
  }

  private native int GetThresholdFunction_5();
  public int GetThresholdFunction()
  {
    return GetThresholdFunction_5();
  }

  private native void SetUpperThreshold_6(double id0);
  public void SetUpperThreshold(double id0)
  {
    SetUpperThreshold_6(id0);
  }

  private native void SetLowerThreshold_7(double id0);
  public void SetLowerThreshold(double id0)
  {
    SetLowerThreshold_7(id0);
  }

  private native double GetUpperThreshold_8();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_8();
  }

  private native double GetLowerThreshold_9();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_9();
  }

  private native void SetAttributeMode_10(int id0);
  public void SetAttributeMode(int id0)
  {
    SetAttributeMode_10(id0);
  }

  private native int GetAttributeMode_11();
  public int GetAttributeMode()
  {
    return GetAttributeMode_11();
  }

  private native void SetAttributeModeToDefault_12();
  public void SetAttributeModeToDefault()
  {
    SetAttributeModeToDefault_12();
  }

  private native void SetAttributeModeToUsePointData_13();
  public void SetAttributeModeToUsePointData()
  {
    SetAttributeModeToUsePointData_13();
  }

  private native void SetAttributeModeToUseCellData_14();
  public void SetAttributeModeToUseCellData()
  {
    SetAttributeModeToUseCellData_14();
  }

  private native byte[] GetAttributeModeAsString_15();
  public String GetAttributeModeAsString()
  {
    return new String(GetAttributeModeAsString_15(), StandardCharsets.UTF_8);
  }

  private native void SetComponentMode_16(int id0);
  public void SetComponentMode(int id0)
  {
    SetComponentMode_16(id0);
  }

  private native int GetComponentModeMinValue_17();
  public int GetComponentModeMinValue()
  {
    return GetComponentModeMinValue_17();
  }

  private native int GetComponentModeMaxValue_18();
  public int GetComponentModeMaxValue()
  {
    return GetComponentModeMaxValue_18();
  }

  private native int GetComponentMode_19();
  public int GetComponentMode()
  {
    return GetComponentMode_19();
  }

  private native void SetComponentModeToUseSelected_20();
  public void SetComponentModeToUseSelected()
  {
    SetComponentModeToUseSelected_20();
  }

  private native void SetComponentModeToUseAll_21();
  public void SetComponentModeToUseAll()
  {
    SetComponentModeToUseAll_21();
  }

  private native void SetComponentModeToUseAny_22();
  public void SetComponentModeToUseAny()
  {
    SetComponentModeToUseAny_22();
  }

  private native byte[] GetComponentModeAsString_23();
  public String GetComponentModeAsString()
  {
    return new String(GetComponentModeAsString_23(), StandardCharsets.UTF_8);
  }

  private native void SetSelectedComponent_24(int id0);
  public void SetSelectedComponent(int id0)
  {
    SetSelectedComponent_24(id0);
  }

  private native int GetSelectedComponentMinValue_25();
  public int GetSelectedComponentMinValue()
  {
    return GetSelectedComponentMinValue_25();
  }

  private native int GetSelectedComponentMaxValue_26();
  public int GetSelectedComponentMaxValue()
  {
    return GetSelectedComponentMaxValue_26();
  }

  private native int GetSelectedComponent_27();
  public int GetSelectedComponent()
  {
    return GetSelectedComponent_27();
  }

  private native void SetAllScalars_28(int id0);
  public void SetAllScalars(int id0)
  {
    SetAllScalars_28(id0);
  }

  private native int GetAllScalars_29();
  public int GetAllScalars()
  {
    return GetAllScalars_29();
  }

  private native void AllScalarsOn_30();
  public void AllScalarsOn()
  {
    AllScalarsOn_30();
  }

  private native void AllScalarsOff_31();
  public void AllScalarsOff()
  {
    AllScalarsOff_31();
  }

  private native void SetUseContinuousCellRange_32(int id0);
  public void SetUseContinuousCellRange(int id0)
  {
    SetUseContinuousCellRange_32(id0);
  }

  private native int GetUseContinuousCellRange_33();
  public int GetUseContinuousCellRange()
  {
    return GetUseContinuousCellRange_33();
  }

  private native void UseContinuousCellRangeOn_34();
  public void UseContinuousCellRangeOn()
  {
    UseContinuousCellRangeOn_34();
  }

  private native void UseContinuousCellRangeOff_35();
  public void UseContinuousCellRangeOff()
  {
    UseContinuousCellRangeOff_35();
  }

  private native void SetPointsDataTypeToDouble_36();
  public void SetPointsDataTypeToDouble()
  {
    SetPointsDataTypeToDouble_36();
  }

  private native void SetPointsDataTypeToFloat_37();
  public void SetPointsDataTypeToFloat()
  {
    SetPointsDataTypeToFloat_37();
  }

  private native void SetPointsDataType_38(int id0);
  public void SetPointsDataType(int id0)
  {
    SetPointsDataType_38(id0);
  }

  private native int GetPointsDataType_39();
  public int GetPointsDataType()
  {
    return GetPointsDataType_39();
  }

  private native void SetInvert_40(boolean id0);
  public void SetInvert(boolean id0)
  {
    SetInvert_40(id0);
  }

  private native boolean GetInvert_41();
  public boolean GetInvert()
  {
    return GetInvert_41();
  }

  private native void InvertOn_42();
  public void InvertOn()
  {
    InvertOn_42();
  }

  private native void InvertOff_43();
  public void InvertOff()
  {
    InvertOff_43();
  }

  private native void SetOutputPointsPrecision_44(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_44(id0);
  }

  private native int GetOutputPointsPrecision_45();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_45();
  }

  private native int Lower_46(double id0);
  public int Lower(double id0)
  {
    return Lower_46(id0);
  }

  private native int Upper_47(double id0);
  public int Upper(double id0)
  {
    return Upper_47(id0);
  }

  private native int Between_48(double id0);
  public int Between(double id0)
  {
    return Between_48(id0);
  }

  public vtkThreshold() { super(); }

  public vtkThreshold(long id) { super(id); }
  public native long   VTKInit();

}
