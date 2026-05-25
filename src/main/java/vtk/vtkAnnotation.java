// java wrapper for vtkAnnotation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnnotation extends vtkDataObject
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native long GetSelection_5();
  public vtkSelection GetSelection()
  {
    long temp = GetSelection_5();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelection_6(vtkSelection id0);
  public void SetSelection(vtkSelection id0)
  {
    SetSelection_6(id0);
  }

  private native long GetData_7(vtkInformation id0);
  public vtkAnnotation GetData(vtkInformation id0)
  {
    long temp = GetData_7(id0);

    if (temp == 0) return null;
    return (vtkAnnotation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_8(vtkInformationVector id0,int id1);
  public vtkAnnotation GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_8(id0,id1);

    if (temp == 0) return null;
    return (vtkAnnotation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long LABEL_9();
  public vtkInformationStringKey LABEL()
  {
    long temp = LABEL_9();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long COLOR_10();
  public vtkInformationDoubleVectorKey COLOR()
  {
    long temp = COLOR_10();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long OPACITY_11();
  public vtkInformationDoubleKey OPACITY()
  {
    long temp = OPACITY_11();

    if (temp == 0) return null;
    return (vtkInformationDoubleKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ICON_INDEX_12();
  public vtkInformationIntegerKey ICON_INDEX()
  {
    long temp = ICON_INDEX_12();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ENABLE_13();
  public vtkInformationIntegerKey ENABLE()
  {
    long temp = ENABLE_13();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long HIDE_14();
  public vtkInformationIntegerKey HIDE()
  {
    long temp = HIDE_14();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_15();
  public vtkInformationDataObjectKey DATA()
  {
    long temp = DATA_15();

    if (temp == 0) return null;
    return (vtkInformationDataObjectKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_16();
  public void Initialize()
  {
    Initialize_16();
  }

  private native void ShallowCopy_17(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_17(id0);
  }

  private native void DeepCopy_18(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_18(id0);
  }

  private native long GetMTime_19();
  public long GetMTime()
  {
    return GetMTime_19();
  }

  public vtkAnnotation() { super(); }

  public vtkAnnotation(long id) { super(id); }
  public native long   VTKInit();

}
