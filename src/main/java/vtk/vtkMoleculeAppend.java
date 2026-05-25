// java wrapper for vtkMoleculeAppend object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMoleculeAppend extends vtkMoleculeAlgorithm
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

  private native long GetInput_4(int id0);
  public vtkDataObject GetInput(int id0)
  {
    long temp = GetInput_4(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_5();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetMergeCoincidentAtoms_6();
  public boolean GetMergeCoincidentAtoms()
  {
    return GetMergeCoincidentAtoms_6();
  }

  private native void SetMergeCoincidentAtoms_7(boolean id0);
  public void SetMergeCoincidentAtoms(boolean id0)
  {
    SetMergeCoincidentAtoms_7(id0);
  }

  private native void MergeCoincidentAtomsOn_8();
  public void MergeCoincidentAtomsOn()
  {
    MergeCoincidentAtomsOn_8();
  }

  private native void MergeCoincidentAtomsOff_9();
  public void MergeCoincidentAtomsOff()
  {
    MergeCoincidentAtomsOff_9();
  }

  public vtkMoleculeAppend() { super(); }

  public vtkMoleculeAppend(long id) { super(id); }
  public native long   VTKInit();

}
