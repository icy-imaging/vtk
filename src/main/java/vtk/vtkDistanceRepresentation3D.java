// java wrapper for vtkDistanceRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDistanceRepresentation3D extends vtkDistanceRepresentation
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

  private native void SetGlyphScale_5(double id0);
  public void SetGlyphScale(double id0)
  {
    SetGlyphScale_5(id0);
  }

  private native double GetGlyphScale_6();
  public double GetGlyphScale()
  {
    return GetGlyphScale_6();
  }

  private native long GetLineProperty_7();
  public vtkProperty GetLineProperty()
  {
    long temp = GetLineProperty_7();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelPosition_8(double id0);
  public void SetLabelPosition(double id0)
  {
    SetLabelPosition_8(id0);
  }

  private native double GetLabelPosition_9();
  public double GetLabelPosition()
  {
    return GetLabelPosition_9();
  }

  private native void SetMaximumNumberOfRulerTicks_10(int id0);
  public void SetMaximumNumberOfRulerTicks(int id0)
  {
    SetMaximumNumberOfRulerTicks_10(id0);
  }

  private native int GetMaximumNumberOfRulerTicksMinValue_11();
  public int GetMaximumNumberOfRulerTicksMinValue()
  {
    return GetMaximumNumberOfRulerTicksMinValue_11();
  }

  private native int GetMaximumNumberOfRulerTicksMaxValue_12();
  public int GetMaximumNumberOfRulerTicksMaxValue()
  {
    return GetMaximumNumberOfRulerTicksMaxValue_12();
  }

  private native int GetMaximumNumberOfRulerTicks_13();
  public int GetMaximumNumberOfRulerTicks()
  {
    return GetMaximumNumberOfRulerTicks_13();
  }

  private native long GetGlyphActor_14();
  public vtkActor GetGlyphActor()
  {
    long temp = GetGlyphActor_14();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelActor_15();
  public vtkFollower GetLabelActor()
  {
    long temp = GetLabelActor_15();

    if (temp == 0) return null;
    return (vtkFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelActor_16(vtkFollower id0);
  public void SetLabelActor(vtkFollower id0)
  {
    SetLabelActor_16(id0);
  }

  private native void GetPoint1WorldPosition_17(double id0[]);
  public void GetPoint1WorldPosition(double id0[])
  {
    GetPoint1WorldPosition_17(id0);
  }

  private native void GetPoint2WorldPosition_18(double id0[]);
  public void GetPoint2WorldPosition(double id0[])
  {
    GetPoint2WorldPosition_18(id0);
  }

  private native void SetPoint1WorldPosition_19(double id0[]);
  public void SetPoint1WorldPosition(double id0[])
  {
    SetPoint1WorldPosition_19(id0);
  }

  private native void SetPoint2WorldPosition_20(double id0[]);
  public void SetPoint2WorldPosition(double id0[])
  {
    SetPoint2WorldPosition_20(id0);
  }

  private native void SetPoint1DisplayPosition_21(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_21(id0);
  }

  private native void SetPoint2DisplayPosition_22(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_22(id0);
  }

  private native void GetPoint1DisplayPosition_23(double id0[]);
  public void GetPoint1DisplayPosition(double id0[])
  {
    GetPoint1DisplayPosition_23(id0);
  }

  private native void GetPoint2DisplayPosition_24(double id0[]);
  public void GetPoint2DisplayPosition(double id0[])
  {
    GetPoint2DisplayPosition_24(id0);
  }

  private native void BuildRepresentation_25();
  public void BuildRepresentation()
  {
    BuildRepresentation_25();
  }

  private native void ReleaseGraphicsResources_26(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_26(id0);
  }

  private native int RenderOpaqueGeometry_27(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_27(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_28(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_28(id0);
  }

  private native void SetLabelScale_29(double id0,double id1,double id2);
  public void SetLabelScale(double id0,double id1,double id2)
  {
    SetLabelScale_29(id0,id1,id2);
  }

  private native void SetLabelScale_30(double id0[]);
  public void SetLabelScale(double id0[])
  {
    SetLabelScale_30(id0);
  }

  private native long GetLabelProperty_31();
  public vtkProperty GetLabelProperty()
  {
    long temp = GetLabelProperty_31();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDistanceRepresentation3D() { super(); }

  public vtkDistanceRepresentation3D(long id) { super(id); }
  public native long   VTKInit();

}
