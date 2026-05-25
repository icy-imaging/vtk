// java wrapper for vtkQuadratureSchemeDefinition object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuadratureSchemeDefinition extends vtkObject
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

  private native long DICTIONARY_4();
  public vtkInformationQuadratureSchemeDefinitionVectorKey DICTIONARY()
  {
    long temp = DICTIONARY_4();

    if (temp == 0) return null;
    return (vtkInformationQuadratureSchemeDefinitionVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long QUADRATURE_OFFSET_ARRAY_NAME_5();
  public vtkInformationStringKey QUADRATURE_OFFSET_ARRAY_NAME()
  {
    long temp = QUADRATURE_OFFSET_ARRAY_NAME_5();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int DeepCopy_6(vtkQuadratureSchemeDefinition id0);
  public int DeepCopy(vtkQuadratureSchemeDefinition id0)
  {
    return DeepCopy_6(id0);
  }

  private native int SaveState_7(vtkXMLDataElement id0);
  public int SaveState(vtkXMLDataElement id0)
  {
    return SaveState_7(id0);
  }

  private native int RestoreState_8(vtkXMLDataElement id0);
  public int RestoreState(vtkXMLDataElement id0)
  {
    return RestoreState_8(id0);
  }

  private native void Clear_9();
  public void Clear()
  {
    Clear_9();
  }

  private native int GetCellType_10();
  public int GetCellType()
  {
    return GetCellType_10();
  }

  private native int GetQuadratureKey_11();
  public int GetQuadratureKey()
  {
    return GetQuadratureKey_11();
  }

  private native int GetNumberOfNodes_12();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_12();
  }

  private native int GetNumberOfQuadraturePoints_13();
  public int GetNumberOfQuadraturePoints()
  {
    return GetNumberOfQuadraturePoints_13();
  }

  public vtkQuadratureSchemeDefinition() { super(); }

  public vtkQuadratureSchemeDefinition(long id) { super(id); }
  public native long   VTKInit();

}
