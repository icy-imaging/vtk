// java wrapper for vtkKMeansDistanceFunctor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKMeansDistanceFunctor extends vtkObject
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

  private native long GetEmptyTuple_4(long id0);
  public vtkVariantArray GetEmptyTuple(long id0)
  {
    long temp = GetEmptyTuple_4(id0);

    if (temp == 0) return null;
    return (vtkVariantArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PairwiseUpdate_5(vtkTable id0,long id1,vtkVariantArray id2,long id3,long id4);
  public void PairwiseUpdate(vtkTable id0,long id1,vtkVariantArray id2,long id3,long id4)
  {
    PairwiseUpdate_5(id0,id1,id2,id3,id4);
  }

  private native void PerturbElement_6(vtkTable id0,vtkTable id1,long id2,long id3,long id4,double id5);
  public void PerturbElement(vtkTable id0,vtkTable id1,long id2,long id3,long id4,double id5)
  {
    PerturbElement_6(id0,id1,id2,id3,id4,id5);
  }

  private native long CreateCoordinateArray_7();
  public vtkAbstractArray CreateCoordinateArray()
  {
    long temp = CreateCoordinateArray_7();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_8();
  public int GetDataType()
  {
    return GetDataType_8();
  }

  public vtkKMeansDistanceFunctor() { super(); }

  public vtkKMeansDistanceFunctor(long id) { super(id); }
  public native long   VTKInit();

}
