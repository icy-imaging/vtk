// java wrapper for vtkAbstractPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractPicker extends vtkObject
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

  private native long GetRenderer_4();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_4();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetSelectionPoint_5();
  public double[] GetSelectionPoint()
  {
    return GetSelectionPoint_5();
  }

  private native double[] GetPickPosition_6();
  public double[] GetPickPosition()
  {
    return GetPickPosition_6();
  }

  private native int Pick_7(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_7(id0,id1,id2,id3);
  }

  private native int Pick_8(double id0[],vtkRenderer id1);
  public int Pick(double id0[],vtkRenderer id1)
  {
    return Pick_8(id0,id1);
  }

  private native int Pick3DPoint_9(double id0[],vtkRenderer id1);
  public int Pick3DPoint(double id0[],vtkRenderer id1)
  {
    return Pick3DPoint_9(id0,id1);
  }

  private native int Pick3DRay_10(double id0[],double id1[],vtkRenderer id2);
  public int Pick3DRay(double id0[],double id1[],vtkRenderer id2)
  {
    return Pick3DRay_10(id0,id1,id2);
  }

  private native void SetPickFromList_11(int id0);
  public void SetPickFromList(int id0)
  {
    SetPickFromList_11(id0);
  }

  private native int GetPickFromList_12();
  public int GetPickFromList()
  {
    return GetPickFromList_12();
  }

  private native void PickFromListOn_13();
  public void PickFromListOn()
  {
    PickFromListOn_13();
  }

  private native void PickFromListOff_14();
  public void PickFromListOff()
  {
    PickFromListOff_14();
  }

  private native void InitializePickList_15();
  public void InitializePickList()
  {
    InitializePickList_15();
  }

  private native void AddPickList_16(vtkProp id0);
  public void AddPickList(vtkProp id0)
  {
    AddPickList_16(id0);
  }

  private native void DeletePickList_17(vtkProp id0);
  public void DeletePickList(vtkProp id0)
  {
    DeletePickList_17(id0);
  }

  private native long GetPickList_18();
  public vtkPropCollection GetPickList()
  {
    long temp = GetPickList_18();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAbstractPicker() { super(); }

  public vtkAbstractPicker(long id) { super(id); }

}
