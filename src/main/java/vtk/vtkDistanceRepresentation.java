// java wrapper for vtkDistanceRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDistanceRepresentation extends vtkWidgetRepresentation
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

  private native double GetDistance_4();
  public double GetDistance()
  {
    return GetDistance_4();
  }

  private native void GetPoint1WorldPosition_5(double id0[]);
  public void GetPoint1WorldPosition(double id0[])
  {
    GetPoint1WorldPosition_5(id0);
  }

  private native void GetPoint2WorldPosition_6(double id0[]);
  public void GetPoint2WorldPosition(double id0[])
  {
    GetPoint2WorldPosition_6(id0);
  }

  private native double[] GetPoint1WorldPosition_7();
  public double[] GetPoint1WorldPosition()
  {
    return GetPoint1WorldPosition_7();
  }

  private native double[] GetPoint2WorldPosition_8();
  public double[] GetPoint2WorldPosition()
  {
    return GetPoint2WorldPosition_8();
  }

  private native void SetPoint1DisplayPosition_9(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_9(id0);
  }

  private native void SetPoint2DisplayPosition_10(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_10(id0);
  }

  private native void GetPoint1DisplayPosition_11(double id0[]);
  public void GetPoint1DisplayPosition(double id0[])
  {
    GetPoint1DisplayPosition_11(id0);
  }

  private native void GetPoint2DisplayPosition_12(double id0[]);
  public void GetPoint2DisplayPosition(double id0[])
  {
    GetPoint2DisplayPosition_12(id0);
  }

  private native void SetPoint1WorldPosition_13(double id0[]);
  public void SetPoint1WorldPosition(double id0[])
  {
    SetPoint1WorldPosition_13(id0);
  }

  private native void SetPoint2WorldPosition_14(double id0[]);
  public void SetPoint2WorldPosition(double id0[])
  {
    SetPoint2WorldPosition_14(id0);
  }

  private native void SetHandleRepresentation_15(vtkHandleRepresentation id0);
  public void SetHandleRepresentation(vtkHandleRepresentation id0)
  {
    SetHandleRepresentation_15(id0);
  }

  private native void InstantiateHandleRepresentation_16();
  public void InstantiateHandleRepresentation()
  {
    InstantiateHandleRepresentation_16();
  }

  private native long GetPoint1Representation_17();
  public vtkHandleRepresentation GetPoint1Representation()
  {
    long temp = GetPoint1Representation_17();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint2Representation_18();
  public vtkHandleRepresentation GetPoint2Representation()
  {
    long temp = GetPoint2Representation_18();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_19(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_19(id0);
  }

  private native int GetToleranceMinValue_20();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_20();
  }

  private native int GetToleranceMaxValue_21();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_21();
  }

  private native int GetTolerance_22();
  public int GetTolerance()
  {
    return GetTolerance_22();
  }

  private native void SetLabelFormat_23(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_23(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_24();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_24(), StandardCharsets.UTF_8);
  }

  private native void SetScale_25(double id0);
  public void SetScale(double id0)
  {
    SetScale_25(id0);
  }

  private native double GetScale_26();
  public double GetScale()
  {
    return GetScale_26();
  }

  private native void SetRulerMode_27(int id0);
  public void SetRulerMode(int id0)
  {
    SetRulerMode_27(id0);
  }

  private native int GetRulerMode_28();
  public int GetRulerMode()
  {
    return GetRulerMode_28();
  }

  private native void RulerModeOn_29();
  public void RulerModeOn()
  {
    RulerModeOn_29();
  }

  private native void RulerModeOff_30();
  public void RulerModeOff()
  {
    RulerModeOff_30();
  }

  private native void SetRulerDistance_31(double id0);
  public void SetRulerDistance(double id0)
  {
    SetRulerDistance_31(id0);
  }

  private native double GetRulerDistanceMinValue_32();
  public double GetRulerDistanceMinValue()
  {
    return GetRulerDistanceMinValue_32();
  }

  private native double GetRulerDistanceMaxValue_33();
  public double GetRulerDistanceMaxValue()
  {
    return GetRulerDistanceMaxValue_33();
  }

  private native double GetRulerDistance_34();
  public double GetRulerDistance()
  {
    return GetRulerDistance_34();
  }

  private native void SetNumberOfRulerTicks_35(int id0);
  public void SetNumberOfRulerTicks(int id0)
  {
    SetNumberOfRulerTicks_35(id0);
  }

  private native int GetNumberOfRulerTicksMinValue_36();
  public int GetNumberOfRulerTicksMinValue()
  {
    return GetNumberOfRulerTicksMinValue_36();
  }

  private native int GetNumberOfRulerTicksMaxValue_37();
  public int GetNumberOfRulerTicksMaxValue()
  {
    return GetNumberOfRulerTicksMaxValue_37();
  }

  private native int GetNumberOfRulerTicks_38();
  public int GetNumberOfRulerTicks()
  {
    return GetNumberOfRulerTicks_38();
  }

  private native void BuildRepresentation_39();
  public void BuildRepresentation()
  {
    BuildRepresentation_39();
  }

  private native int ComputeInteractionState_40(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_40(id0,id1,id2);
  }

  private native void StartWidgetInteraction_41(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_41(id0);
  }

  private native void WidgetInteraction_42(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_42(id0);
  }

  public vtkDistanceRepresentation() { super(); }

  public vtkDistanceRepresentation(long id) { super(id); }

}
