// java wrapper for vtkBiDimensionalRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBiDimensionalRepresentation extends vtkWidgetRepresentation
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

  private native void SetPoint1WorldPosition_4(double id0[]);
  public void SetPoint1WorldPosition(double id0[])
  {
    SetPoint1WorldPosition_4(id0);
  }

  private native void SetPoint2WorldPosition_5(double id0[]);
  public void SetPoint2WorldPosition(double id0[])
  {
    SetPoint2WorldPosition_5(id0);
  }

  private native void SetPoint3WorldPosition_6(double id0[]);
  public void SetPoint3WorldPosition(double id0[])
  {
    SetPoint3WorldPosition_6(id0);
  }

  private native void SetPoint4WorldPosition_7(double id0[]);
  public void SetPoint4WorldPosition(double id0[])
  {
    SetPoint4WorldPosition_7(id0);
  }

  private native void GetPoint1WorldPosition_8(double id0[]);
  public void GetPoint1WorldPosition(double id0[])
  {
    GetPoint1WorldPosition_8(id0);
  }

  private native void GetPoint2WorldPosition_9(double id0[]);
  public void GetPoint2WorldPosition(double id0[])
  {
    GetPoint2WorldPosition_9(id0);
  }

  private native void GetPoint3WorldPosition_10(double id0[]);
  public void GetPoint3WorldPosition(double id0[])
  {
    GetPoint3WorldPosition_10(id0);
  }

  private native void GetPoint4WorldPosition_11(double id0[]);
  public void GetPoint4WorldPosition(double id0[])
  {
    GetPoint4WorldPosition_11(id0);
  }

  private native void SetPoint1DisplayPosition_12(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_12(id0);
  }

  private native void SetPoint2DisplayPosition_13(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_13(id0);
  }

  private native void SetPoint3DisplayPosition_14(double id0[]);
  public void SetPoint3DisplayPosition(double id0[])
  {
    SetPoint3DisplayPosition_14(id0);
  }

  private native void SetPoint4DisplayPosition_15(double id0[]);
  public void SetPoint4DisplayPosition(double id0[])
  {
    SetPoint4DisplayPosition_15(id0);
  }

  private native void GetPoint1DisplayPosition_16(double id0[]);
  public void GetPoint1DisplayPosition(double id0[])
  {
    GetPoint1DisplayPosition_16(id0);
  }

  private native void GetPoint2DisplayPosition_17(double id0[]);
  public void GetPoint2DisplayPosition(double id0[])
  {
    GetPoint2DisplayPosition_17(id0);
  }

  private native void GetPoint3DisplayPosition_18(double id0[]);
  public void GetPoint3DisplayPosition(double id0[])
  {
    GetPoint3DisplayPosition_18(id0);
  }

  private native void GetPoint4DisplayPosition_19(double id0[]);
  public void GetPoint4DisplayPosition(double id0[])
  {
    GetPoint4DisplayPosition_19(id0);
  }

  private native long GetPoint1Representation_20();
  public vtkHandleRepresentation GetPoint1Representation()
  {
    long temp = GetPoint1Representation_20();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint2Representation_21();
  public vtkHandleRepresentation GetPoint2Representation()
  {
    long temp = GetPoint2Representation_21();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint3Representation_22();
  public vtkHandleRepresentation GetPoint3Representation()
  {
    long temp = GetPoint3Representation_22();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint4Representation_23();
  public vtkHandleRepresentation GetPoint4Representation()
  {
    long temp = GetPoint4Representation_23();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLine1Visibility_24(int id0);
  public void SetLine1Visibility(int id0)
  {
    SetLine1Visibility_24(id0);
  }

  private native int GetLine1Visibility_25();
  public int GetLine1Visibility()
  {
    return GetLine1Visibility_25();
  }

  private native void Line1VisibilityOn_26();
  public void Line1VisibilityOn()
  {
    Line1VisibilityOn_26();
  }

  private native void Line1VisibilityOff_27();
  public void Line1VisibilityOff()
  {
    Line1VisibilityOff_27();
  }

  private native void SetLine2Visibility_28(int id0);
  public void SetLine2Visibility(int id0)
  {
    SetLine2Visibility_28(id0);
  }

  private native int GetLine2Visibility_29();
  public int GetLine2Visibility()
  {
    return GetLine2Visibility_29();
  }

  private native void Line2VisibilityOn_30();
  public void Line2VisibilityOn()
  {
    Line2VisibilityOn_30();
  }

  private native void Line2VisibilityOff_31();
  public void Line2VisibilityOff()
  {
    Line2VisibilityOff_31();
  }

  private native void SetHandleRepresentation_32(vtkHandleRepresentation id0);
  public void SetHandleRepresentation(vtkHandleRepresentation id0)
  {
    SetHandleRepresentation_32(id0);
  }

  private native void InstantiateHandleRepresentation_33();
  public void InstantiateHandleRepresentation()
  {
    InstantiateHandleRepresentation_33();
  }

  private native void SetTolerance_34(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_34(id0);
  }

  private native int GetToleranceMinValue_35();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_35();
  }

  private native int GetToleranceMaxValue_36();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_36();
  }

  private native int GetTolerance_37();
  public int GetTolerance()
  {
    return GetTolerance_37();
  }

  private native double GetLength1_38();
  public double GetLength1()
  {
    return GetLength1_38();
  }

  private native double GetLength2_39();
  public double GetLength2()
  {
    return GetLength2_39();
  }

  private native void SetLabelFormat_40(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_40(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_41();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_41(), StandardCharsets.UTF_8);
  }

  private native void SetShowLabelAboveWidget_42(int id0);
  public void SetShowLabelAboveWidget(int id0)
  {
    SetShowLabelAboveWidget_42(id0);
  }

  private native int GetShowLabelAboveWidget_43();
  public int GetShowLabelAboveWidget()
  {
    return GetShowLabelAboveWidget_43();
  }

  private native void ShowLabelAboveWidgetOn_44();
  public void ShowLabelAboveWidgetOn()
  {
    ShowLabelAboveWidgetOn_44();
  }

  private native void ShowLabelAboveWidgetOff_45();
  public void ShowLabelAboveWidgetOff()
  {
    ShowLabelAboveWidgetOff_45();
  }

  private native void SetID_46(long id0);
  public void SetID(long id0)
  {
    SetID_46(id0);
  }

  private native long GetID_47();
  public long GetID()
  {
    return GetID_47();
  }

  private native byte[] GetLabelText_48();
  public String GetLabelText()
  {
    return new String(GetLabelText_48(), StandardCharsets.UTF_8);
  }

  private native void GetLabelPosition_49(double id0[]);
  public void GetLabelPosition(double id0[])
  {
    GetLabelPosition_49(id0);
  }

  private native void GetWorldLabelPosition_50(double id0[]);
  public void GetWorldLabelPosition(double id0[])
  {
    GetWorldLabelPosition_50(id0);
  }

  private native void StartWidgetDefinition_51(double id0[]);
  public void StartWidgetDefinition(double id0[])
  {
    StartWidgetDefinition_51(id0);
  }

  private native void Point2WidgetInteraction_52(double id0[]);
  public void Point2WidgetInteraction(double id0[])
  {
    Point2WidgetInteraction_52(id0);
  }

  private native void Point3WidgetInteraction_53(double id0[]);
  public void Point3WidgetInteraction(double id0[])
  {
    Point3WidgetInteraction_53(id0);
  }

  private native void StartWidgetManipulation_54(double id0[]);
  public void StartWidgetManipulation(double id0[])
  {
    StartWidgetManipulation_54(id0);
  }

  public vtkBiDimensionalRepresentation() { super(); }

  public vtkBiDimensionalRepresentation(long id) { super(id); }

}
