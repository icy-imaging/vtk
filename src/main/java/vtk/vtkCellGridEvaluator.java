// java wrapper for vtkCellGridEvaluator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridEvaluator extends vtkCellGridQuery
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

  private native void SetCellAttribute_4(vtkCellAttribute id0);
  public void SetCellAttribute(vtkCellAttribute id0)
  {
    SetCellAttribute_4(id0);
  }

  private native long GetCellAttribute_5();
  public vtkCellAttribute GetCellAttribute()
  {
    long temp = GetCellAttribute_5();

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputPoints_6();
  public vtkDataArray GetInputPoints()
  {
    long temp = GetInputPoints_6();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetClassifierCellTypes_7();
  public vtkTypeUInt32Array GetClassifierCellTypes()
  {
    long temp = GetClassifierCellTypes_7();

    if (temp == 0) return null;
    return (vtkTypeUInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetClassifierCellOffsets_8();
  public vtkTypeUInt64Array GetClassifierCellOffsets()
  {
    long temp = GetClassifierCellOffsets_8();

    if (temp == 0) return null;
    return (vtkTypeUInt64Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetClassifierPointIDs_9();
  public vtkTypeUInt64Array GetClassifierPointIDs()
  {
    long temp = GetClassifierPointIDs_9();

    if (temp == 0) return null;
    return (vtkTypeUInt64Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetClassifierCellIndices_10();
  public vtkTypeUInt64Array GetClassifierCellIndices()
  {
    long temp = GetClassifierCellIndices_10();

    if (temp == 0) return null;
    return (vtkTypeUInt64Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetClassifierPointParameters_11();
  public vtkDataArray GetClassifierPointParameters()
  {
    long temp = GetClassifierPointParameters_11();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInterpolatedValues_12();
  public vtkDataArray GetInterpolatedValues()
  {
    long temp = GetInterpolatedValues_12();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ClassifyPoints_13(vtkDataArray id0);
  public void ClassifyPoints(vtkDataArray id0)
  {
    ClassifyPoints_13(id0);
  }

  private native void InterpolatePoints_14(vtkDataArray id0);
  public void InterpolatePoints(vtkDataArray id0)
  {
    InterpolatePoints_14(id0);
  }

  private native void InterpolateCellParameters_15(vtkTypeUInt32Array id0,vtkTypeUInt64Array id1,vtkTypeUInt64Array id2,vtkDataArray id3);
  public void InterpolateCellParameters(vtkTypeUInt32Array id0,vtkTypeUInt64Array id1,vtkTypeUInt64Array id2,vtkDataArray id3)
  {
    InterpolateCellParameters_15(id0,id1,id2,id3);
  }

  private native int GetPhasesToPerform_16();
  public int GetPhasesToPerform()
  {
    return GetPhasesToPerform_16();
  }

  private native boolean Initialize_17();
  public boolean Initialize()
  {
    return Initialize_17();
  }

  private native void StartPass_18();
  public void StartPass()
  {
    StartPass_18();
  }

  private native boolean IsAnotherPassRequired_19();
  public boolean IsAnotherPassRequired()
  {
    return IsAnotherPassRequired_19();
  }

  private native boolean Finalize_20();
  public boolean Finalize()
  {
    return Finalize_20();
  }

  private native long GetLocator_21();
  public vtkStaticPointLocator GetLocator()
  {
    long temp = GetLocator_21();

    if (temp == 0) return null;
    return (vtkStaticPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCellGridEvaluator() { super(); }

  public vtkCellGridEvaluator(long id) { super(id); }
  public native long   VTKInit();

}
