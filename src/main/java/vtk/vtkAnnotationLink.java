// java wrapper for vtkAnnotationLink object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnnotationLink extends vtkAnnotationLayersAlgorithm
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

  private native long GetAnnotationLayers_4();
  public vtkAnnotationLayers GetAnnotationLayers()
  {
    long temp = GetAnnotationLayers_4();

    if (temp == 0) return null;
    return (vtkAnnotationLayers)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAnnotationLayers_5(vtkAnnotationLayers id0);
  public void SetAnnotationLayers(vtkAnnotationLayers id0)
  {
    SetAnnotationLayers_5(id0);
  }

  private native void SetCurrentSelection_6(vtkSelection id0);
  public void SetCurrentSelection(vtkSelection id0)
  {
    SetCurrentSelection_6(id0);
  }

  private native long GetCurrentSelection_7();
  public vtkSelection GetCurrentSelection()
  {
    long temp = GetCurrentSelection_7();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddDomainMap_8(vtkTable id0);
  public void AddDomainMap(vtkTable id0)
  {
    AddDomainMap_8(id0);
  }

  private native void RemoveDomainMap_9(vtkTable id0);
  public void RemoveDomainMap(vtkTable id0)
  {
    RemoveDomainMap_9(id0);
  }

  private native void RemoveAllDomainMaps_10();
  public void RemoveAllDomainMaps()
  {
    RemoveAllDomainMaps_10();
  }

  private native int GetNumberOfDomainMaps_11();
  public int GetNumberOfDomainMaps()
  {
    return GetNumberOfDomainMaps_11();
  }

  private native long GetDomainMap_12(int id0);
  public vtkTable GetDomainMap(int id0)
  {
    long temp = GetDomainMap_12(id0);

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_13();
  public long GetMTime()
  {
    return GetMTime_13();
  }

  public vtkAnnotationLink() { super(); }

  public vtkAnnotationLink(long id) { super(id); }
  public native long   VTKInit();

}
