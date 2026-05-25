// java wrapper for vtkPlot object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlot extends vtkContextItem
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

  private native void Update_4();
  public void Update()
  {
    Update_4();
  }

  private native void SetLegendVisibility_5(boolean id0);
  public void SetLegendVisibility(boolean id0)
  {
    SetLegendVisibility_5(id0);
  }

  private native boolean GetLegendVisibility_6();
  public boolean GetLegendVisibility()
  {
    return GetLegendVisibility_6();
  }

  private native void LegendVisibilityOn_7();
  public void LegendVisibilityOn()
  {
    LegendVisibilityOn_7();
  }

  private native void LegendVisibilityOff_8();
  public void LegendVisibilityOff()
  {
    LegendVisibilityOff_8();
  }

  private native void SetTooltipLabelFormat_9(byte[] id0, int len0);
  public void SetTooltipLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTooltipLabelFormat_9(bytes0, bytes0.length);
  }

  private native byte[] GetTooltipLabelFormat_10();
  public String GetTooltipLabelFormat()
  {
    return new String(GetTooltipLabelFormat_10(), StandardCharsets.UTF_8);
  }

  private native void SetTooltipNotation_11(int id0);
  public void SetTooltipNotation(int id0)
  {
    SetTooltipNotation_11(id0);
  }

  private native int GetTooltipNotation_12();
  public int GetTooltipNotation()
  {
    return GetTooltipNotation_12();
  }

  private native void SetTooltipPrecision_13(int id0);
  public void SetTooltipPrecision(int id0)
  {
    SetTooltipPrecision_13(id0);
  }

  private native int GetTooltipPrecision_14();
  public int GetTooltipPrecision()
  {
    return GetTooltipPrecision_14();
  }

  private native void SetColor_15(byte id0,byte id1,byte id2,byte id3);
  public void SetColor(byte id0,byte id1,byte id2,byte id3)
  {
    SetColor_15(id0,id1,id2,id3);
  }

  private native void SetColorF_16(double id0,double id1,double id2,double id3);
  public void SetColorF(double id0,double id1,double id2,double id3)
  {
    SetColorF_16(id0,id1,id2,id3);
  }

  private native void SetColorF_17(double id0,double id1,double id2);
  public void SetColorF(double id0,double id1,double id2)
  {
    SetColorF_17(id0,id1,id2);
  }

  private native void SetColor_18(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_18(id0,id1,id2);
  }

  private native void GetColorF_19(double id0[]);
  public void GetColorF(double id0[])
  {
    GetColorF_19(id0);
  }

  private native void GetColor_20(double id0[]);
  public void GetColor(double id0[])
  {
    GetColor_20(id0);
  }

  private native void SetWidth_21(float id0);
  public void SetWidth(float id0)
  {
    SetWidth_21(id0);
  }

  private native float GetWidth_22();
  public float GetWidth()
  {
    return GetWidth_22();
  }

  private native void SetPen_23(vtkPen id0);
  public void SetPen(vtkPen id0)
  {
    SetPen_23(id0);
  }

  private native long GetPen_24();
  public vtkPen GetPen()
  {
    long temp = GetPen_24();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBrush_25(vtkBrush id0);
  public void SetBrush(vtkBrush id0)
  {
    SetBrush_25(id0);
  }

  private native long GetBrush_26();
  public vtkBrush GetBrush()
  {
    long temp = GetBrush_26();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionPen_27(vtkPen id0);
  public void SetSelectionPen(vtkPen id0)
  {
    SetSelectionPen_27(id0);
  }

  private native long GetSelectionPen_28();
  public vtkPen GetSelectionPen()
  {
    long temp = GetSelectionPen_28();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionBrush_29(vtkBrush id0);
  public void SetSelectionBrush(vtkBrush id0)
  {
    SetSelectionBrush_29(id0);
  }

  private native long GetSelectionBrush_30();
  public vtkBrush GetSelectionBrush()
  {
    long temp = GetSelectionBrush_30();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabel_31(byte[] id0, int len0);
  public void SetLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabel_31(bytes0, bytes0.length);
  }

  private native byte[] GetLabel_32();
  public String GetLabel()
  {
    return new String(GetLabel_32(), StandardCharsets.UTF_8);
  }

  private native void SetLabels_33(vtkStringArray id0);
  public void SetLabels(vtkStringArray id0)
  {
    SetLabels_33(id0);
  }

  private native long GetLabels_34();
  public vtkStringArray GetLabels()
  {
    long temp = GetLabels_34();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfLabels_35();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_35();
  }

  private native byte[] GetLabel_36(long id0);
  public String GetLabel(long id0)
  {
    return new String(GetLabel_36(id0), StandardCharsets.UTF_8);
  }

  private native void SetIndexedLabels_37(vtkStringArray id0);
  public void SetIndexedLabels(vtkStringArray id0)
  {
    SetIndexedLabels_37(id0);
  }

  private native long GetIndexedLabels_38();
  public vtkStringArray GetIndexedLabels()
  {
    long temp = GetIndexedLabels_38();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_39();
  public vtkContextMapper2D GetData()
  {
    long temp = GetData_39();

    if (temp == 0) return null;
    return (vtkContextMapper2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetUseIndexForXSeries_40();
  public boolean GetUseIndexForXSeries()
  {
    return GetUseIndexForXSeries_40();
  }

  private native void SetUseIndexForXSeries_41(boolean id0);
  public void SetUseIndexForXSeries(boolean id0)
  {
    SetUseIndexForXSeries_41(id0);
  }

  private native void SetInputData_42(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_42(id0);
  }

  private native void SetInputData_43(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetInputData(vtkTable id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetInputData_43(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native void SetInputData_44(vtkTable id0,long id1,long id2);
  public void SetInputData(vtkTable id0,long id1,long id2)
  {
    SetInputData_44(id0,id1,id2);
  }

  private native void SetInputConnection_45(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_45(id0);
  }

  private native long GetInput_46();
  public vtkTable GetInput()
  {
    long temp = GetInput_46();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputConnection_47();
  public vtkAlgorithmOutput GetInputConnection()
  {
    long temp = GetInputConnection_47();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputArray_48(int id0,byte[] id1, int len1);
  public void SetInputArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputArray_48(id0,bytes1, bytes1.length);
  }

  private native void SetXAxisInputArrayToProcess_49(byte[] id0, int len0);
  public void SetXAxisInputArrayToProcess(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXAxisInputArrayToProcess_49(bytes0, bytes0.length);
  }

  private native byte[] GetXAxisInputArrayToProcess_50();
  public String GetXAxisInputArrayToProcess()
  {
    return new String(GetXAxisInputArrayToProcess_50(), StandardCharsets.UTF_8);
  }

  private native void SetYAxisInputArrayToProcess_51(byte[] id0, int len0);
  public void SetYAxisInputArrayToProcess(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYAxisInputArrayToProcess_51(bytes0, bytes0.length);
  }

  private native byte[] GetYAxisInputArrayToProcess_52();
  public String GetYAxisInputArrayToProcess()
  {
    return new String(GetYAxisInputArrayToProcess_52(), StandardCharsets.UTF_8);
  }

  private native void SetSelectable_53(boolean id0);
  public void SetSelectable(boolean id0)
  {
    SetSelectable_53(id0);
  }

  private native boolean GetSelectable_54();
  public boolean GetSelectable()
  {
    return GetSelectable_54();
  }

  private native void SelectableOn_55();
  public void SelectableOn()
  {
    SelectableOn_55();
  }

  private native void SelectableOff_56();
  public void SelectableOff()
  {
    SelectableOff_56();
  }

  private native void SetSelection_57(vtkIdTypeArray id0);
  public void SetSelection(vtkIdTypeArray id0)
  {
    SetSelection_57(id0);
  }

  private native long GetSelection_58();
  public vtkIdTypeArray GetSelection()
  {
    long temp = GetSelection_58();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXAxis_59();
  public vtkAxis GetXAxis()
  {
    long temp = GetXAxis_59();

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxis_60(vtkAxis id0);
  public void SetXAxis(vtkAxis id0)
  {
    SetXAxis_60(id0);
  }

  private native long GetYAxis_61();
  public vtkAxis GetYAxis()
  {
    long temp = GetYAxis_61();

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYAxis_62(vtkAxis id0);
  public void SetYAxis(vtkAxis id0)
  {
    SetYAxis_62(id0);
  }

  private native void GetBounds_63(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_63(id0);
  }

  private native void GetUnscaledInputBounds_64(double id0[]);
  public void GetUnscaledInputBounds(double id0[])
  {
    GetUnscaledInputBounds_64(id0);
  }

  private native boolean ClampPos_65(double id0[],double id1[]);
  public boolean ClampPos(double id0[],double id1[])
  {
    return ClampPos_65(id0,id1);
  }

  private native boolean ClampPos_66(double id0[]);
  public boolean ClampPos(double id0[])
  {
    return ClampPos_66(id0);
  }

  private native boolean UpdateCache_67();
  public boolean UpdateCache()
  {
    return UpdateCache_67();
  }

  private native void FilterSelectedPoints_68(vtkDataArray id0,vtkDataArray id1,vtkIdTypeArray id2);
  public void FilterSelectedPoints(vtkDataArray id0,vtkDataArray id1,vtkIdTypeArray id2)
  {
    FilterSelectedPoints_68(id0,id1,id2);
  }

  public vtkPlot() { super(); }

  public vtkPlot(long id) { super(id); }

}
