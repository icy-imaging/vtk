// java wrapper for vtkDSPFilterGroup object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDSPFilterGroup extends vtkObject
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

  private native void AddFilter_4(vtkDSPFilterDefinition id0);
  public void AddFilter(vtkDSPFilterDefinition id0)
  {
    AddFilter_4(id0);
  }

  private native void RemoveFilter_5(byte[] id0, int len0);
  public void RemoveFilter(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveFilter_5(bytes0, bytes0.length);
  }

  private native boolean IsThisInputVariableInstanceNeeded_6(byte[] id0, int len0,int id1,int id2);
  public boolean IsThisInputVariableInstanceNeeded(String id0,int id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsThisInputVariableInstanceNeeded_6(bytes0, bytes0.length,id1,id2);
  }

  private native boolean IsThisInputVariableInstanceCached_7(byte[] id0, int len0,int id1);
  public boolean IsThisInputVariableInstanceCached(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsThisInputVariableInstanceCached_7(bytes0, bytes0.length,id1);
  }

  private native void AddInputVariableInstance_8(byte[] id0, int len0,int id1,vtkFloatArray id2);
  public void AddInputVariableInstance(String id0,int id1,vtkFloatArray id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddInputVariableInstance_8(bytes0, bytes0.length,id1,id2);
  }

  private native long GetCachedInput_9(int id0,int id1);
  public vtkFloatArray GetCachedInput(int id0,int id1)
  {
    long temp = GetCachedInput_9(id0,id1);

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCachedOutput_10(int id0,int id1);
  public vtkFloatArray GetCachedOutput(int id0,int id1)
  {
    long temp = GetCachedOutput_10(id0,id1);

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetInputVariableName_11(int id0);
  public String GetInputVariableName(int id0)
  {
    return new String(GetInputVariableName_11(id0), StandardCharsets.UTF_8);
  }

  private native int GetNumFilters_12();
  public int GetNumFilters()
  {
    return GetNumFilters_12();
  }

  private native void Copy_13(vtkDSPFilterGroup id0);
  public void Copy(vtkDSPFilterGroup id0)
  {
    Copy_13(id0);
  }

  private native long GetFilter_14(int id0);
  public vtkDSPFilterDefinition GetFilter(int id0)
  {
    long temp = GetFilter_14(id0);

    if (temp == 0) return null;
    return (vtkDSPFilterDefinition)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDSPFilterGroup() { super(); }

  public vtkDSPFilterGroup(long id) { super(id); }
  public native long   VTKInit();

}
