// java wrapper for vtkToImplicitArrayFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkToImplicitArrayFilter extends vtkPassInputTypeAlgorithm
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

  private native boolean GetUseMaxNumberOfDegreesOfFreedom_4();
  public boolean GetUseMaxNumberOfDegreesOfFreedom()
  {
    return GetUseMaxNumberOfDegreesOfFreedom_4();
  }

  private native void SetUseMaxNumberOfDegreesOfFreedom_5(boolean id0);
  public void SetUseMaxNumberOfDegreesOfFreedom(boolean id0)
  {
    SetUseMaxNumberOfDegreesOfFreedom_5(id0);
  }

  private native void UseMaxNumberOfDegreesOfFreedomOn_6();
  public void UseMaxNumberOfDegreesOfFreedomOn()
  {
    UseMaxNumberOfDegreesOfFreedomOn_6();
  }

  private native void UseMaxNumberOfDegreesOfFreedomOff_7();
  public void UseMaxNumberOfDegreesOfFreedomOff()
  {
    UseMaxNumberOfDegreesOfFreedomOff_7();
  }

  private native double GetTargetReduction_8();
  public double GetTargetReduction()
  {
    return GetTargetReduction_8();
  }

  private native void SetTargetReduction_9(double id0);
  public void SetTargetReduction(double id0)
  {
    SetTargetReduction_9(id0);
  }

  private native void SetStrategy_10(vtkToImplicitStrategy id0);
  public void SetStrategy(vtkToImplicitStrategy id0)
  {
    SetStrategy_10(id0);
  }

  private native long GetStrategy_11();
  public vtkToImplicitStrategy GetStrategy()
  {
    long temp = GetStrategy_11();

    if (temp == 0) return null;
    return (vtkToImplicitStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetArraySelection_12(int id0);
  public vtkDataArraySelection GetArraySelection(int id0)
  {
    long temp = GetArraySelection_12(id0);

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointDataArraySelection_13();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_13();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_14();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_14();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFieldDataArraySelection_15();
  public vtkDataArraySelection GetFieldDataArraySelection()
  {
    long temp = GetFieldDataArraySelection_15();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointsThenCellsDataArraySelection_16();
  public vtkDataArraySelection GetPointsThenCellsDataArraySelection()
  {
    long temp = GetPointsThenCellsDataArraySelection_16();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexDataArraySelection_17();
  public vtkDataArraySelection GetVertexDataArraySelection()
  {
    long temp = GetVertexDataArraySelection_17();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeDataArraySelection_18();
  public vtkDataArraySelection GetEdgeDataArraySelection()
  {
    long temp = GetEdgeDataArraySelection_18();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRowDataArraySelection_19();
  public vtkDataArraySelection GetRowDataArraySelection()
  {
    long temp = GetRowDataArraySelection_19();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkToImplicitArrayFilter() { super(); }

  public vtkToImplicitArrayFilter(long id) { super(id); }
  public native long   VTKInit();

}
