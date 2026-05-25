// java wrapper for vtkBoxWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBoxWidget extends vtk3DWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void PlaceWidget_5(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_5(id0);
  }

  private native void PlaceWidget_6();
  public void PlaceWidget()
  {
    PlaceWidget_6();
  }

  private native void PlaceWidget_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_7(id0,id1,id2,id3,id4,id5);
  }

  private native void GetPlanes_8(vtkPlanes id0);
  public void GetPlanes(vtkPlanes id0)
  {
    GetPlanes_8(id0);
  }

  private native void SetInsideOut_9(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_9(id0);
  }

  private native int GetInsideOut_10();
  public int GetInsideOut()
  {
    return GetInsideOut_10();
  }

  private native void InsideOutOn_11();
  public void InsideOutOn()
  {
    InsideOutOn_11();
  }

  private native void InsideOutOff_12();
  public void InsideOutOff()
  {
    InsideOutOff_12();
  }

  private native void GetTransform_13(vtkTransform id0);
  public void GetTransform(vtkTransform id0)
  {
    GetTransform_13(id0);
  }

  private native void SetTransform_14(vtkTransform id0);
  public void SetTransform(vtkTransform id0)
  {
    SetTransform_14(id0);
  }

  private native void GetPolyData_15(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_15(id0);
  }

  private native long GetHandleProperty_16();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_16();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_17();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_17();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void HandlesOn_18();
  public void HandlesOn()
  {
    HandlesOn_18();
  }

  private native void HandlesOff_19();
  public void HandlesOff()
  {
    HandlesOff_19();
  }

  private native long GetFaceProperty_20();
  public vtkProperty GetFaceProperty()
  {
    long temp = GetFaceProperty_20();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedFaceProperty_21();
  public vtkProperty GetSelectedFaceProperty()
  {
    long temp = GetSelectedFaceProperty_21();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_22();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_22();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_23();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_23();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutlineFaceWires_24(int id0);
  public void SetOutlineFaceWires(int id0)
  {
    SetOutlineFaceWires_24(id0);
  }

  private native int GetOutlineFaceWires_25();
  public int GetOutlineFaceWires()
  {
    return GetOutlineFaceWires_25();
  }

  private native void OutlineFaceWiresOn_26();
  public void OutlineFaceWiresOn()
  {
    OutlineFaceWiresOn_26();
  }

  private native void OutlineFaceWiresOff_27();
  public void OutlineFaceWiresOff()
  {
    OutlineFaceWiresOff_27();
  }

  private native void SetOutlineCursorWires_28(int id0);
  public void SetOutlineCursorWires(int id0)
  {
    SetOutlineCursorWires_28(id0);
  }

  private native int GetOutlineCursorWires_29();
  public int GetOutlineCursorWires()
  {
    return GetOutlineCursorWires_29();
  }

  private native void OutlineCursorWiresOn_30();
  public void OutlineCursorWiresOn()
  {
    OutlineCursorWiresOn_30();
  }

  private native void OutlineCursorWiresOff_31();
  public void OutlineCursorWiresOff()
  {
    OutlineCursorWiresOff_31();
  }

  private native void SetTranslationEnabled_32(int id0);
  public void SetTranslationEnabled(int id0)
  {
    SetTranslationEnabled_32(id0);
  }

  private native int GetTranslationEnabled_33();
  public int GetTranslationEnabled()
  {
    return GetTranslationEnabled_33();
  }

  private native void TranslationEnabledOn_34();
  public void TranslationEnabledOn()
  {
    TranslationEnabledOn_34();
  }

  private native void TranslationEnabledOff_35();
  public void TranslationEnabledOff()
  {
    TranslationEnabledOff_35();
  }

  private native void SetScalingEnabled_36(int id0);
  public void SetScalingEnabled(int id0)
  {
    SetScalingEnabled_36(id0);
  }

  private native int GetScalingEnabled_37();
  public int GetScalingEnabled()
  {
    return GetScalingEnabled_37();
  }

  private native void ScalingEnabledOn_38();
  public void ScalingEnabledOn()
  {
    ScalingEnabledOn_38();
  }

  private native void ScalingEnabledOff_39();
  public void ScalingEnabledOff()
  {
    ScalingEnabledOff_39();
  }

  private native void SetRotationEnabled_40(int id0);
  public void SetRotationEnabled(int id0)
  {
    SetRotationEnabled_40(id0);
  }

  private native int GetRotationEnabled_41();
  public int GetRotationEnabled()
  {
    return GetRotationEnabled_41();
  }

  private native void RotationEnabledOn_42();
  public void RotationEnabledOn()
  {
    RotationEnabledOn_42();
  }

  private native void RotationEnabledOff_43();
  public void RotationEnabledOff()
  {
    RotationEnabledOff_43();
  }

  public vtkBoxWidget() { super(); }

  public vtkBoxWidget(long id) { super(id); }
  public native long   VTKInit();

}
