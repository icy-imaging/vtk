// java wrapper for vtkWeightedTransformFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWeightedTransformFilter extends vtkPointSetAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetWeightArray_5(byte[] id0, int len0);
  public void SetWeightArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWeightArray_5(bytes0, bytes0.length);
  }

  private native byte[] GetWeightArray_6();
  public String GetWeightArray()
  {
    return new String(GetWeightArray_6(), StandardCharsets.UTF_8);
  }

  private native void SetTransformIndexArray_7(byte[] id0, int len0);
  public void SetTransformIndexArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTransformIndexArray_7(bytes0, bytes0.length);
  }

  private native byte[] GetTransformIndexArray_8();
  public String GetTransformIndexArray()
  {
    return new String(GetTransformIndexArray_8(), StandardCharsets.UTF_8);
  }

  private native void SetCellDataWeightArray_9(byte[] id0, int len0);
  public void SetCellDataWeightArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellDataWeightArray_9(bytes0, bytes0.length);
  }

  private native byte[] GetCellDataWeightArray_10();
  public String GetCellDataWeightArray()
  {
    return new String(GetCellDataWeightArray_10(), StandardCharsets.UTF_8);
  }

  private native void SetCellDataTransformIndexArray_11(byte[] id0, int len0);
  public void SetCellDataTransformIndexArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellDataTransformIndexArray_11(bytes0, bytes0.length);
  }

  private native byte[] GetCellDataTransformIndexArray_12();
  public String GetCellDataTransformIndexArray()
  {
    return new String(GetCellDataTransformIndexArray_12(), StandardCharsets.UTF_8);
  }

  private native void SetTransform_13(vtkAbstractTransform id0,int id1);
  public void SetTransform(vtkAbstractTransform id0,int id1)
  {
    SetTransform_13(id0,id1);
  }

  private native long GetTransform_14(int id0);
  public vtkAbstractTransform GetTransform(int id0)
  {
    long temp = GetTransform_14(id0);

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfTransforms_15(int id0);
  public void SetNumberOfTransforms(int id0)
  {
    SetNumberOfTransforms_15(id0);
  }

  private native int GetNumberOfTransforms_16();
  public int GetNumberOfTransforms()
  {
    return GetNumberOfTransforms_16();
  }

  private native void AddInputValuesOn_17();
  public void AddInputValuesOn()
  {
    AddInputValuesOn_17();
  }

  private native void AddInputValuesOff_18();
  public void AddInputValuesOff()
  {
    AddInputValuesOff_18();
  }

  private native void SetAddInputValues_19(int id0);
  public void SetAddInputValues(int id0)
  {
    SetAddInputValues_19(id0);
  }

  private native int GetAddInputValues_20();
  public int GetAddInputValues()
  {
    return GetAddInputValues_20();
  }

  public vtkWeightedTransformFilter() { super(); }

  public vtkWeightedTransformFilter(long id) { super(id); }
  public native long   VTKInit();

}
