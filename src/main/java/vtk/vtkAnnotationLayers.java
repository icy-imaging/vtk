// java wrapper for vtkAnnotationLayers object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnnotationLayers extends vtkDataObject
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

  private native void SetCurrentAnnotation_5(vtkAnnotation id0);
  public void SetCurrentAnnotation(vtkAnnotation id0)
  {
    SetCurrentAnnotation_5(id0);
  }

  private native long GetCurrentAnnotation_6();
  public vtkAnnotation GetCurrentAnnotation()
  {
    long temp = GetCurrentAnnotation_6();

    if (temp == 0) return null;
    return (vtkAnnotation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCurrentSelection_7(vtkSelection id0);
  public void SetCurrentSelection(vtkSelection id0)
  {
    SetCurrentSelection_7(id0);
  }

  private native long GetCurrentSelection_8();
  public vtkSelection GetCurrentSelection()
  {
    long temp = GetCurrentSelection_8();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfAnnotations_9();
  public int GetNumberOfAnnotations()
  {
    return GetNumberOfAnnotations_9();
  }

  private native long GetAnnotation_10(int id0);
  public vtkAnnotation GetAnnotation(int id0)
  {
    long temp = GetAnnotation_10(id0);

    if (temp == 0) return null;
    return (vtkAnnotation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddAnnotation_11(vtkAnnotation id0);
  public void AddAnnotation(vtkAnnotation id0)
  {
    AddAnnotation_11(id0);
  }

  private native void RemoveAnnotation_12(vtkAnnotation id0);
  public void RemoveAnnotation(vtkAnnotation id0)
  {
    RemoveAnnotation_12(id0);
  }

  private native void Initialize_13();
  public void Initialize()
  {
    Initialize_13();
  }

  private native void ShallowCopy_14(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_14(id0);
  }

  private native void DeepCopy_15(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_15(id0);
  }

  private native long GetData_16(vtkInformation id0);
  public vtkAnnotationLayers GetData(vtkInformation id0)
  {
    long temp = GetData_16(id0);

    if (temp == 0) return null;
    return (vtkAnnotationLayers)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_17(vtkInformationVector id0,int id1);
  public vtkAnnotationLayers GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_17(id0,id1);

    if (temp == 0) return null;
    return (vtkAnnotationLayers)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  public vtkAnnotationLayers() { super(); }

  public vtkAnnotationLayers(long id) { super(id); }
  public native long   VTKInit();

}
